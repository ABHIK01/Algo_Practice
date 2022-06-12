class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;
        int sum = 0;
        //int end = 0;
        int start = 0;
        int maxSum = 0;
        /*
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
        */
        for(int end = 0;end<length;end++) {
            while(set.contains(nums[end])){
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }
            sum += nums[end];
            set.add(nums[end]);
            maxSum = Math.max(maxSum,sum);
        }
        
        return maxSum;
        
    }
}