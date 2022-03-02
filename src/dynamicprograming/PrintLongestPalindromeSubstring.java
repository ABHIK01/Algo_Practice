package dynamicprograming;


//https://leetcode.com/problems/longest-palindromic-substring/discuss/1780710/JAVA-oror-SIMPLE-SOLUTION-oror-DP
 // https://leetcode.com/problems/longest-palindromic-substring/
public class PrintLongestPalindromeSubstring {

    public  static String longestPalindrome(String s) {
        String ans = "";
        int length = s.length();

        boolean[][] dp = new boolean[length][length];

        for(int gap = 0;gap<length;gap++) {
            for(int i = 0,j = gap;j<length;i++,j++){
                if(gap == 0){
                    dp[i][j] = true;
                } else if(gap == 1) {
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }


                }

                if(dp[i][j] && ans.length() < s.substring(i,j+1).length()){
                    ans = s.substring(i,j+1);
                }
            }
        }

        return ans;


    }

    public static void main(String[] args) {

        String s = "babad";

        System.out.println(longestPalindrome( s));

    }



}
