class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        solve(0,candidates,target,
              new ArrayList<>(),res);

        return res;
    }

    public void solve(int start,
                      int[] arr,
                      int target,
                      List<Integer> list,
                      List<List<Integer>> res){

        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<arr.length;i++){

            
            if(i>start && arr[i]==arr[i-1])
                continue;

            if(arr[i]>target)
                break;

            list.add(arr[i]);

            solve(i+1,
                  arr,
                  target-arr[i],
                  list,
                  res);

            list.remove(list.size()-1);
        }
    }
}