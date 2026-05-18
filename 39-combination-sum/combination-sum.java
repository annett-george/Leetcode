class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combinations(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    public void combinations(int i, int[] arr, int target, List<List<Integer>> res, List<Integer> list){
        if(i==arr.length){
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[i]<=target){
            list.add(arr[i]);
            combinations(i,arr,target-arr[i],res,list);
            list.remove(list.size()-1);
        }
        combinations(i+1,arr,target,res,list);
    }
}