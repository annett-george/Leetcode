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
            str.append(sum%2);
            carry=sum/2;
        }
        if(carry==1){
            str.append('1');
        }
        return str.reverse().toString();
    }
}