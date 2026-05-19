class Solution {
    public void findsubsets(int i, int[] arr, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int j=i; j<arr.length; j++){
            if(j>i && arr[j]==arr[j-1]){
                continue;
            }
            list.add(arr[j]);
            findsubsets(j+1,arr,list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findsubsets(0,nums,new ArrayList<>(), ans);
        return ans;
    }
}