class Solution {
    public boolean checkDivisibility(int n) {
        int dup= n;
        int sum=0, mul=1;
        while(n!=0){
            int a = n%10;
            sum+=a;
            mul*=a;
            n=n/10;
        }
        return dup%(sum+mul)==0;
    }
}