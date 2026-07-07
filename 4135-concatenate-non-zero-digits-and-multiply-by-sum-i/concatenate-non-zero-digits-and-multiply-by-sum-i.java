class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int x=0;
        int count=1;
        while(n!=0){
            int rem = n%10;
            if(rem!=0){
                sum+=rem;
                x+=count*rem;
                count*=10;
            }
            n/=10;
        }
        return (long)sum*x;
    }
}