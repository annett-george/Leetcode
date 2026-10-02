class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int n = image[sr][sc];
        dfs(image,n,color,sr,sc);
        return image;
    }
    public void dfs(int[][] graph, int n, int col, int i, int j){
        if(i<0|| j<0 || i>=graph.length || j>=graph[0].length){
            return;
        }
        if(graph[i][j]==n){
            graph[i][j]=col;
            dfs(graph,n,col,i-1,j);
            dfs(graph,n,col,i,j-1);
            dfs(graph,n,col,i+1,j);
            dfs(graph,n,col,i,j+1);
        }
    }
}