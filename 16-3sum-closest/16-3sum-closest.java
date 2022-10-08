class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0;i<nums.length;i++) {
            int low = i+1;
            int high = length-1;
            while(low < high) {
               int sum = nums[i] + nums[low]  + nums[high];
            if(sum < target){
                low++;
            } else  {
                 high--;
            }
                
                if(Math.abs(sum-target) < minDiff){
                minDiff = Math.abs(sum-target);
                ans = sum;
            } 
               
            }
            
            
            }
            
            
    
        
        return ans;
    }
}