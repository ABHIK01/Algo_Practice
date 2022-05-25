class Solution {
    public int numDistinctIslands(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<column;j++) {
                if(grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(i,j,row,column,grid,"s",sb);
                    if(!set.contains(sb.toString())){
                        set.add(sb.toString());
                    }
                }
            }
        }
       return set.size(); 
    }
    
    public void  dfs(int i,int j,int row,int column,int[][] grid,String dir,StringBuilder sb) {
        
        if( i  < 0 || j < 0 || i >= row || j >= column || grid[i][j] == 0 ){
            return;
        }
        
        grid[i][j] = 0;
        sb.append(dir);
        dfs(i+1,j,row,column,grid,"d",sb);
        dfs(i-1,j,row,column,grid,"u",sb);
        dfs(i,j+1,row,column,grid,"r",sb);
        dfs(i,j-1,row,column,grid,"l",sb);
        sb.append("e");
        
        
        
    }
}