class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, (a, b) -> a[0] - b[0]);
        for(int i=0; i<ranges.length; i++){
            if(left>right){
                return true;
            }
            if(ranges[i][0]>left){
                return false;
            }
            if(ranges[i][1]>=left){
                left=ranges[i][1]+1;
            }
        }
        return left>right;
    }
}