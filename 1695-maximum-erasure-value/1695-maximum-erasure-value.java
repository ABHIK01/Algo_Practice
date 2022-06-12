class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;
        int sum = 0;
        int end = 0;
        int start = 0;
        int maxSum = 0;
        while(end < length) {
            if(set.add(nums[end])){
                sum += nums[end];
                end++;
            } else {
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }
            maxSum = Math.max(maxSum,sum);
            
        }
        
        return maxSum;
        
    }
}