class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int column = triangle.size();
        
        int[][] dp = new int[row][column];
        int min = Integer.MAX_VALUE;
        
        for(int i = 0;i<triangle.get(0).size();i++) {
            dp[0][i] = triangle.get(0).get(i);
        }
        
        for(int i = 1;i<row;i++) {
            List<Integer> traingleRow = triangle.get(i);
            for(int j = 0;j<traingleRow.size();j++) {
                if(j == 0) {
                    dp[i][j ] = dp[i-1][j] + traingleRow.get(j);
                } else if(j == traingleRow.size() - 1) {
                    dp[i][j] = dp[i-1][j-1] + traingleRow.get(j);
                }else {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]) + traingleRow.get(j);
                }
            }
        }
        
        for(int i = 0;i<column;i++) {
            min = Math.min(dp[row-1][i],min);
        }
        
        return min;
        
    }
}