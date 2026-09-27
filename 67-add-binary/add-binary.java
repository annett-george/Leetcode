class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str =new StringBuilder();
        int carry =0;
        for(int i=a.length()-1, j = b.length()-1; i>=0 || j>=0; i--,j--){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            if(sum==0){
                str.append('0');
                carry=0;
            }
            else if(sum==1){
                str.append('1');
                carry=0;
            }
            else if(sum==2){
                str.append('0');
                carry=1;
            }
            else{
                str.append('1');
                carry=1;
            }
        }
        if(carry==1){
            str.append('1');
        }
        return str.reverse().toString();
    }
}