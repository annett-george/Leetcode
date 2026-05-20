class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch = board[i][j];
                if(ch!='.'){
                    for(int k=0;k<9;k++){
                        if(board[k][j]==ch && k!=i){
                            return false;
                        }
                        if(board[i][k]==ch && k!=j){
                            return false;
                        }
                        int r=3*(i/3)+k/3, c=3*(j/3)+k%3;
                        if(board[r][c]==ch && (r!=i || c!=j)){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}