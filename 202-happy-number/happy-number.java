class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow= sq(slow);
            fast=sq(sq(fast));
        }while(slow!=fast);
        return slow==1;
    }
    public int sq(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
}