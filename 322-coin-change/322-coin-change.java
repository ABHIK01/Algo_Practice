class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        
        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++) {
                
                if(i == 0 && j == 0) {
                    dp[i][j] = 0;
                } 
                if(i == 0) {
                    dp[i][j] = amount+1;
                    
                } else if(j == 0) {
                    dp[i][j] = 0;
                    
                } else {
                    if(j  < coins[i-1]) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.min(dp[i-1][j],1+ dp[i][j-coins[i-1]]);
                    }
                    
                }
            }
        }
        
        
        return dp[n][amount]>amount  ?-1:dp[n][amount];
        
        
        
    }
}