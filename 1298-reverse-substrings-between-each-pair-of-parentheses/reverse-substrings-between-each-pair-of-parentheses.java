class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        Queue<Character> temp = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                while(st.peek()!='('){
                    temp.offer(st.pop());
                }
                st.pop();
                while(!temp.isEmpty()){
                    st.push(temp.poll());
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}