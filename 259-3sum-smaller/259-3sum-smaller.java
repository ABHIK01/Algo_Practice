class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int length = nums.length;
        int count = 0;
        for(int i = 0;i<length;i++) {
            int low = i+1;
            int high = length-1;
            while(low<high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum < target){
                    count += high-low;
                        low++;
                } else {
                    high--;
                }
            }
        }
        
        return count;
        
        
    }
}