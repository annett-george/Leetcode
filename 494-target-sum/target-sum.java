class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return sumways(nums,target,0,0);
    }
    public int sumways(int[] arr, int k, int sum, int i){
        if(i==arr.length){
            return sum==k? 1:0;
        }
        int l=sumways(arr,k,sum+arr[i],i+1);
        int r = sumways(arr,k,sum-arr[i],i+1);
        return l+r;
    }
}