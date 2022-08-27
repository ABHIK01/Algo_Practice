class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        
        return Math.max(rob(nums,dp,0,nums.length-2),rob(nums,dp,1,nums.length-1));
        
    }
    
    
    int rob(int[] nums,int[] dp,int start,int end){
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start],nums[start+1]);
        for(int i = start+2;i<nums.length;i++) {
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        
        return dp[end];
    }
}