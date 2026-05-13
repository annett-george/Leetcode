class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length*grid.length];
        int[] res = new int[2];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                arr[grid[i][j]-1]++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                res[0]=i+1;
            }
            if(arr[i]==0){
                res[1]=i+1;
            }
        }
        return res;
    }
}