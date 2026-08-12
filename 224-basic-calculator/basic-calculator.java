class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        s=s.replace(" ","");
        int res=0,sign=1,num=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = s.charAt(i)-'0';
                i++;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=num* 10 + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                res+=num*sign;
                sign=1;
            }
            else if(s.charAt(i)== '+'){
                sign= 1;
            }
            else if(s.charAt(i)=='-'){
                sign=-1;
            }
            else if(s.charAt(i)=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
            }
            else if(s.charAt(i)==')'){
                res= st.pop()*res;
                res+=st.pop();
            }
        }
        return res;
    }
}