class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        for(int i=1; i<nums.length; i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                res.add(i);
            }
        }
        return res;
    }
}