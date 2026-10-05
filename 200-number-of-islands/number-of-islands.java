class Solution { 

    // class pair{
    //     int first;
    //     int second;
    //     public pair(int first, int second){
    //         this.first = first;
    //         this.second = second;
    //     }
    // }

    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count =0;
        for(int i=0; i<grid.length; i++){
            for(int j =0; j<grid[0].length; j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    bfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(int i, int j, char[][] grid, boolean[][]vis){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        vis[i][j] = true;
        while(!q.isEmpty()){
            int row = q.peek()[0];
            int col = q.peek()[1];
            q.poll();
            if(row-1>=0 && grid[row-1][col]=='1' && !vis[row-1][col]){
                q.offer(new int[]{row-1,col});
                vis[row-1][col]=true;
            }
            if(col-1>=0 && grid[row][col-1]=='1' && !vis[row][col-1]){
                q.offer(new int[]{row,col-1});
                vis[row][col-1]=true;
            }
            if(row+1<grid.length && grid[row+1][col]=='1' && !vis[row+1][col]){
                q.offer(new int[]{row+1,col});
                vis[row+1][col]=true;
            }
            if(col+1<grid[0].length && grid[row][col+1]=='1' && !vis[row][col+1]){
                q.offer(new int[]{row,col+1});
                vis[row][col+1]=true;
            }
        }
    }
}