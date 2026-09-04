class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min = new int[nums.length];
        int temp= nums[nums.length-1];
        for(int i=nums.length-1; i>=0;i--){
            if(temp>nums[i]){
                temp=nums[i];
            }
            min[i]=temp;
        }
        int max=nums[0];
        for(int i=0; i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(max-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}