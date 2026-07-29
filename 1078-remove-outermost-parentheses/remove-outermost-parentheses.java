class Solution {
    public String removeOuterParentheses(String s) {
        String str ="";
        int count=0;
        for(Character ch: s.toCharArray()){
            if(ch=='('){
                if(count!=0){
                    str+=ch;
                }
                count--;
            }
            else{
                count++;
                if(count!=0){
                    str+=ch;
                }
            }
        }
        return str;
    }
}