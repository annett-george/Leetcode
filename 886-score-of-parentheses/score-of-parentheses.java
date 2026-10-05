class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                st.push(-1);
            }
            else{
                if(st.peek()==-1){
                    st.pop();
                    st.push(1);
                }
                else{
                    int n = st.pop();
                    while(st.peek()!= -1){
                         n += st.pop();
                    }
                    st.pop();
                    n = n + n;
                    st.push(n);
                }
            }
        }
        int n=0;
        while(!st.isEmpty()){
            n+= st.pop();
        }
        return n;
    }
}