class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[nums.length-k+1];
        for(int i=0; i<nums.length; i++){
            if(!dq.isEmpty() && i-dq.peekFirst()>=k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                arr[i-k+1]=nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}