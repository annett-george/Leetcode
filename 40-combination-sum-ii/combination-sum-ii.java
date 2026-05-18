class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combinations(0,candidates,target,new ArrayList<>(), res);
        return res;
    }
    public void combinations(int i, int[] arr, int target, List<Integer> list, List<List<Integer>> res ){
        if(i==arr.length || target<=0){
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(arr[i]);
        combinations(i+1,arr,target-arr[i],list,res);
        list.remove(list.size()-1);
        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }
        combinations(i+1,arr,target,list,res);
        return;
    }
}