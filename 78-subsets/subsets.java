class Solution {
    public void findsubsets(int i, int[] arr, List<Integer> list, List<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        findsubsets(i+1,arr,list,ans);
        list.add(arr[i]);
        findsubsets(i+1,arr,list,ans);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findsubsets(0,nums,new ArrayList<>(),res);
        return res;
    }
}