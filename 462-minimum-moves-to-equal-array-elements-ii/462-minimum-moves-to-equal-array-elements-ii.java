class Solution {
    public int minMoves2(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        int mid = nums[length/2];
        int count = 0;
        for(int i = 0;i<nums.length;i++) {
            count += Math.abs(nums[i] - mid);
        }
        
        return count;
        
    }
}