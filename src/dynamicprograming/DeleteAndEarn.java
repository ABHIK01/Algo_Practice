package dynamicprograming;


//https://leetcode.com/problems/delete-and-earn/
public class DeleteAndEarn {
    public static  int deleteAndEarn(int[] nums) {

        int[] freq = new int[10001];
        for(int num:nums) {
            freq[num] = freq[num] + num;
        }

        int[] dp = new int[freq.length];
        if(freq.length  == 1) {
            return freq[0];
        }

        dp[0] = freq[0];
        dp[1] = Math.max(dp[0],freq[1]);
        for(int i = 2;i<freq.length;i++) {
            dp[i] = Math.max(freq[i] + dp[i-2],dp[i-1]);
        }

        return dp[dp.length-1];

    }
    public static void main(String[] args) {

        int[] nums = {2,2,3,3,3,4};

        System.out.println(deleteAndEarn(nums));

    }
}
