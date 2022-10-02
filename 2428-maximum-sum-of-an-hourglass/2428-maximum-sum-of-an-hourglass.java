class Solution {
    public int maxSum(int[][] grid) {
        int maxSum = 0;
        int row = grid.length;
        int column = grid[0].length;
        
        int sum = 0;
        
        for(int i =0;i<row-2;i++){
            for(int j = 0;j<column-2;j++){
                sum = grid[i][j] + grid[i][j+1] + grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                maxSum = Math.max(sum,maxSum);
                
            }
        }
        
        return maxSum;
        
    }
}