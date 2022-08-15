class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0,end = (long) Math.sqrt(c);
        
        while(start <= end) {
            long result = start * start + end * end;
            if(result == c) {
                return true;
            } else if(result > c) {
                end--;
            }else {
                start++;
            }
        }
        
        return false;
        
    }
}