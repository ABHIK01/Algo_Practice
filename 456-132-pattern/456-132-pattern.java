class Solution {
    public boolean find132pattern(int[] nums) {
        /*
        for(int i = 0;i<nums.length-2;i++) {
            for(int j = i+1;j<nums.length-1;j++) {
                for(int k = j+1;k<nums.length;k++) {
                    if(nums[k] > nums[i] && nums[j] > nums[k]){
                        return true;
                    }
                }
            }
            
        }
        
        return false;
        3,1,4,2  nums[k] > nums[i] and nums[j] > nums[k]
        */
        /*
        int minimum_i = Integer.MAX_VALUE;
        for(int j = 0;j<nums.length-1;j++) {
            minimum_i = Math.min(minimum_i,nums[j]);
            for(int k = j+1;k<nums.length;k++) {
                if(nums[k] > minimum_i && nums[k] < nums[j]){
                    return true;
                }
            }
        }
        return false;
        */
        
        int temp = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length-1;i>=0;i--) {
            if(temp > nums[i]) {
                return true;
            }
            while(!stack.isEmpty() && nums[i] > stack.peek()) {
                temp = stack.pop();
            }
            stack.push(nums[i]);
        }
        
        return false;
    }
}