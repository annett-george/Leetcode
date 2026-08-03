class Solution {
    public int calculate(String s) {
        int num=0;
        char prev='+';
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
            }
            if((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1){
                if(prev=='/'){
                    st.push(st.pop()/num);
                }
                else if(prev=='*'){
                    st.push(num*st.pop());
                }
                else if(prev=='-'){
                    st.push(-num);
                }
                else if(prev=='+'){
                    st.push(num);
                }
                num=0;
                prev=ch;
            }
        }
        while(!st.isEmpty()){
            num+=st.pop();
        }
        return num;
    }
}