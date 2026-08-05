class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] arr = new int[temperatures.length];
        for(int i=temperatures.length-1; i>=0; i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek()-i;;
            }
            st.push(i);
        }
        return arr;
    }
}