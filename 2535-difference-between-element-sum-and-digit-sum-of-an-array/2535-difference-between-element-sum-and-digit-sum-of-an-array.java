class Solution {
    public int differenceOfSum(int[] nums) {
        
        int elemSum = 0;
        int digitSum = 0;
        for(int num:nums) {
            elemSum += num;
            String numString = Integer.toString(num);
            for(int i = 0;i<numString.length();i++){
                digitSum += numString.charAt(i) - '0';
            }
            }
        
        return Math.abs(elemSum-digitSum);
        
    }
}