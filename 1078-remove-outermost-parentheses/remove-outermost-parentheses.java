class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder("");
        int count=0;
        for(Character ch: s.toCharArray()){
            if(ch=='('){
                count--;
                if(count!=-1){
                    str.append(ch);
                }
            }
            else{
                count++;
                if(count!=0){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}