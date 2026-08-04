class Solution {
    public boolean isPowerOfThree(int n) {
        long val=1;
        while(n>=val){
            if(n==val){
                return true;
            }
            val=val*3;
        }
        return false;
    }
}