package dynamicprograming;


//https://leetcode.com/problems/longest-palindromic-subsequence/submissions/

//reverse of longest common subsequence,just need to reverse that string

public class LongestPlaindromicSubsequence {

    public static int longestPalindromeSubseq(String s) {
        StringBuffer sb = new StringBuffer(s);
        String rs = sb.reverse().toString();
        int n = s.length();
        int m = rs.length();


        int[][] dp = new int[n+1][m+1];

        for(int i = 0;i<n+1;i++) {
            for(int j = 0;j<m+1;j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }


        for(int i = 1;i<n+1;i++) {
            for(int j = 1;j<m+1;j++) {
                if(s.charAt(i-1) == rs.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        return dp[n][m];



    }

    public static void main(String[] args) {
        String s = "bbbab";

        System.out.println(longestPalindromeSubseq(s));


    }
}
