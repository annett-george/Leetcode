class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String str ="";
        for(Character ch: s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(st.peek()=='('&& ch==')'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
                if(!st.isEmpty()){
                    str+=ch;
                }
            }
        }
        return str;
    }
}