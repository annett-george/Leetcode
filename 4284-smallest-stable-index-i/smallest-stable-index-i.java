class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min = new int[nums.length];
        int[] max = new int[nums.length];
        int temp=nums[0];
        for(int i=0; i<nums.length; i++){
            if(temp<nums[i]){
                temp=nums[i];
            }
            max[i]=temp;
        }
        temp= nums[nums.length-1];
        for(int i=nums.length-1; i>=0;i--){
            if(temp>nums[i]){
                temp=nums[i];
            }
            min[i]=temp;
        }
        for(int i=0; i<nums.length;i++){
            if(max[i]-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}