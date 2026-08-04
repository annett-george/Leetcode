class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int num= nums[0]+1;
        for(int i=1; i<nums.length; i++){
            while(num!=nums[i]){
                list.add(num);
                num++;
            }
            num++;
        }
        return list;
    }
}