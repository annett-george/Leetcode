class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int square=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            square+= (temp*temp);
            n/=10;
        }
        return square-sum>=50;
    }
}