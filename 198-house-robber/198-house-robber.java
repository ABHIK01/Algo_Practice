class Solution {
    public int rob(int[] nums) {
        /*
        int[] dp = new int[nums.length];
       if(nums.length == 1) {
           return nums[0];
       }
        else {
             
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        
        for(int i = 2;i<nums.length;i++) {
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
            
        }
       
        
        
        return dp[nums.length-1];
        */
        /*
        int inc = nums[0];
        int exc = 0;
        for(int i = 1;i<nums.length;i++) {
            int ninc = nums[i] + exc;
            int nexc = Math.max(exc,inc);
            
             inc = ninc;
             exc = nexc;
            
            
        }
        
        return Math.max(inc,exc);
        */
        /*
        int inc = nums[0];
        int exc = 0;
        for(int i = 1;i<nums.length;i++) {
            int  nexc = Math.max(inc,exc);
            int ninc = exc + nums[i];
            exc = nexc;
            inc = ninc;
        }
        
        return Math.max(inc,exc);
        */
        int[] dp = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        } else {
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);
            
            for(int i = 2;i<nums.length;i++) {
                dp[i] = Math.max(dp[i-1],nums[i] + dp[i-2] );
            }
        }
        
        return dp[nums.length-1];
        
        
    }
}