class Solution {
    public double average(int[] salary) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<salary.length;i++) {
            sum += salary[i];
            minValue = Math.min(minValue,salary[i]);
            maxValue = Math.max(maxValue,salary[i]);
            
            
        }
        return (double) (sum-maxValue-minValue) / (double) (salary.length-2);
        
    }
}