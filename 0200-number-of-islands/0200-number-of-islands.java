class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count = 0;
        
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<column;j++) {
                if(grid[i][j] == '1'){
                    dfs(i,j,row,column,grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    void dfs(int i,int j,int row,int column,char[][] grid) {
        if(i < 0|| j <0 || i>=row || j>= column || grid[i][j] == '0' ){
            return;
        }
        grid[i][j] = '0';
        dfs(i+1,j,row,column,grid);
        dfs(i-1,j,row,column,grid);
        dfs(i,j+1,row,column,grid);
        dfs(i,j-1,row,column,grid);
        
    }
}