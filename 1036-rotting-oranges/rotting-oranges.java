class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int time =0;
        boolean flag = true;;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    flag=false;
                }
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(flag){
            return 0;
        }
        while(!q.isEmpty()){
            int n = q.size();
            for(int a=0; a<n; a++){
                int r = q.peek()[0];
                int c = q.peek()[1];
                q.poll();
                if(r-1>=0 && grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    q.offer(new int[]{r-1,c});
                }
                if(c-1>=0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    q.offer(new int[]{r,c-1});
                }
                if(r+1<grid.length && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    q.offer(new int[]{r+1,c});
                }
                if(c+1<grid[0].length && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    q.offer(new int[]{r,c+1});
                }
            }
            time++;
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time-1;
    }
}
   