class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int m = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            else{
                m = Math.min(m,i-hm.get(nums[i]));
                hm.put(nums[i],i);
            }
        }
        return m<=k;
    }
}