class Solution {
    public boolean check(int[] nums) {
        int flag=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                flag++;
            }
        }
        if(nums[nums.length - 1] > nums[0]) {
            flag++;
        }
        
        return flag<=1;
    }
}