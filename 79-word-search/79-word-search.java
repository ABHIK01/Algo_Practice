class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        boolean[][] visited = new boolean[row][column];
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<column;j++){
                if(board[i][j] == word.charAt(0)) {
                    if(helper(i,j,row,column,board,word,0,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    boolean  helper(int i,int j,int row,int column,char[][] board, String word,int index,boolean[][] visited) {
        if(index == word.length()) {
            return true;
        }
        if( i< 0 || j < 0 || i >= row || j >= column || visited[i][j] || board[i][j] != word.charAt(index)   ){
            return false;
        }
        visited[i][j] = true;
        
        if(helper(i+1,j,row,column,board,word,index+1,visited) || helper(i-1,j,row,column,board,word,index+1,visited) || helper(i,j-1,row,column,board,word,index+1,visited) || helper(i,j+1,row,column,board,word,index+1,visited)){
            return true;
        }
        
        visited[i][j] = false;
        return false;
        
    }
}