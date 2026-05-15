class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(int i=0; i<s.length(); i++){
            char ch=t.charAt(i);
            sum+=ch;
            ch=s.charAt(i);
            sum-=ch;
        }
        sum+=t.charAt(t.length()-1);
        return (char)sum;
    }
}