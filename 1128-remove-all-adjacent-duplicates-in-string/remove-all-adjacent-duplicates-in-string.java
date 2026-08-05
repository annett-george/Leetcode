class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        char cmp = s.charAt(0);
        str.append(cmp);
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(str.length()!=0 && cmp==ch){
                str.deleteCharAt(str.length()-1);
                cmp= str.length() ==0 ? '#' : str.charAt(str.length()-1);
            }
            else{
                str.append(ch);
                cmp=ch;
            }
            
        }
        return str.toString();
    }
}