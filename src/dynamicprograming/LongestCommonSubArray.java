package dynamicprograming;


//https://leetcode.com/problems/maximum-length-of-repeated-subarray/

public class LongestCommonSubArray {

    public  static  int findLength(int[] nums1,int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];

        for(int i = 0;i<n+1;i++) {
            for(int j = 0;j<m+1;j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0; //if any of the string or array is empty then result is 0
                }
            }
        }

        int maxLength = 0;
        for(int i = 1;i<n+1;i++) {
            for(int j = 1;j<m+1;j++) {
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    maxLength = Math.max(maxLength,dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        System.out.println(findLength( nums1,nums2));


    }
}
