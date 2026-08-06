class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int dup=n;
            int mul=1;
            while(dup!=0){
                mul= mul*(dup%10);
                dup/=10;
            }
            if(mul%t==0){
                return n;
            }
            n++;
        }
       // return n;
    }
}