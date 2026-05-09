class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        int n = grid[0].length;
        for(int i=0; i<grid.length; i++){
            int low=0, high=n-1;
            while(low<=high){
                int mid= low+(high-low)/2;
                if(grid[i][mid]>=0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            count+=n-high-1;
        }
        return count;
    }
}