class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        for(int i=0; i<=n; i++){
            if(i*i==total){
                return i;
            }
        }
        return -1;
    }
}