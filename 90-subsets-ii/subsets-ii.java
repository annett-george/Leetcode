class Solution {
    public void findsubsets(int i, int[] arr, List<Integer> list, List<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        findsubsets(i+1,arr,list,ans);
        list.remove(list.size()-1);
        while(i<arr.length-1 && arr[i]==arr[i+1]){
            i++;
        }
        findsubsets(i+1,arr,list,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findsubsets(0,nums,new ArrayList<>(), ans);
        return ans;
    }
}