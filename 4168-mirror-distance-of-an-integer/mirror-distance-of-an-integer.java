class Solution {
    public int mirrorDistance(int n) {
        int rev=0, dup=n;
        while(dup>0){
            rev=rev*10+(dup%10);
            dup/=10;
        }
        return Math.abs(rev-n);
    }
}