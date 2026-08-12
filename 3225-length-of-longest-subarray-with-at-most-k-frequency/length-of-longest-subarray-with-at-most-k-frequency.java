class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i=0, len=0;
        for(int j=0; j<nums.length; j++){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while(hm.get(nums[j])>k){
                hm.put(nums[i],hm.get(nums[i])-1);
                i++;
            }
            len = Math.max(len,j-i+1);
        }
        return len;
    }
}