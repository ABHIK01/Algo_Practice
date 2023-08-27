class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
    
             int actualSum = (length * (length+1) )/2;
      
        int expectedSum = 0;
        for(int i = 0;i<length;i++) {
            expectedSum += nums[i];
        }
        return actualSum - expectedSum;
        
    }
}