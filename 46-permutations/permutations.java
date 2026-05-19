class Solution {
    public void possiblepermutes(int idx, int[] arr, List<List<Integer>> ans){
        if(idx==arr.length){
            List<Integer> list = new ArrayList<>();
            for(int nums:arr){
                list.add(nums);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        int temp;
        for(int i=idx; i<arr.length; i++){
            temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
            possiblepermutes(idx+1,arr,ans);
            temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        possiblepermutes(0,nums,ans);
        return ans;
    }
}