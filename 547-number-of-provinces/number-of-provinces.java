class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        int k =0;
        for(int i=0;i<n; i++){
            if(!vis[i]){
                dfs(i,vis,adj);
                k++;
            }
        }
        return k;
    }
    public static void dfs(int node, boolean[] vis, List<List<Integer>> adj){
        vis[node]=true;
        for(Integer i : adj.get(node)){
            if(!vis[i]){
                dfs(i,vis,adj);
            }
        }
    }
}