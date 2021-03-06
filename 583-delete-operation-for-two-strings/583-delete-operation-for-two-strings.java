class Solution {
    public int minDistance(String word1, String word2) {
        //as we need to find the uncommon word,so we can find the common word from //two strings (using LCS longest common substring ) and delete rest of the characters
        int row = word1.length();
        int column = word2.length();
        int[][] dp = new int[row+1][column+1];
        
        for(int i = 0;i<row+1;i++) {
            for(int j = 0;j<column+1;j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        
        
        
        for(int i = 1;i<row+1;i++) {
            for(int j = 1;j<column+1;j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return (row + column) - 2 * dp[row][column];
        
    }
}