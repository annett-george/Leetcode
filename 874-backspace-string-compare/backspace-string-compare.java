class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='#'){
                if(str.length()>0)
                    str.deleteCharAt(str.length()-1);
            }
            else{
                str.append(ch);
            }
        }
        StringBuilder st = new StringBuilder();
        for(char ch: t.toCharArray()){
            if(ch=='#'){
                if(st.length()>0)
                    st.deleteCharAt(st.length()-1);
            }
            else{
                st.append(ch);
            }
        }
        return str.toString().equals(st.toString());
    }
}