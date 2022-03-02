package dynamicprograming;

//https://leetcode.com/problems/house-robber-ii/
public class HouseRobber2 {

    public  static int rob(int[] nums) {
        int[] dp = new int[nums.length];

        if(nums.length == 1) {
            return nums[0];
        }



        if(nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }

        return Math.max(rob(nums,0,nums.length-2,dp),rob(nums,1,nums.length-1,dp));



    }

    public static  int rob(int[] nums,int start,int end,int[] dp) {
        dp[start] = nums[start];
        dp[start+1] =  Math.max(nums[start],nums[start+1]) ;
        for(int i = start+2;i<nums.length;i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        }

        return dp[end];

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.println(rob(nums));

    }
}
