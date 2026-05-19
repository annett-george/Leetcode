class Solution {
    public void solve(int col, char[][] board, List<List<String>> ans, int[] lrow, int[] lowdiag, int[]updiag, int n){
        if(col==n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row=0; row<n; row++){
            if(lrow[row]==0 && lowdiag[row+col]==0 && updiag[n-1+row-col]==0){
                board[row][col]='Q';
                lrow[row]=1;
                lowdiag[row+col]=1;
                updiag[n-1+row-col]=1;
                solve(col+1,board,ans,lrow,lowdiag,updiag,n);
                board[row][col]='.';
                lrow[row]=0;
                lowdiag[row+col]=0;
                updiag[n-1+row-col]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        int[] lrow= new int[n];
        int[] lowdiag = new int[2*n-1];
        int[] updiag = new int[2*n-1];

        solve(0,board,ans,lrow,lowdiag,updiag,n);
        return ans;
    }
}