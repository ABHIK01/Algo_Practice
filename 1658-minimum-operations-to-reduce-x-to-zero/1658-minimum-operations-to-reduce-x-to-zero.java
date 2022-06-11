class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        
        int arraySum = 0;
        for(int num:nums) {
            arraySum += num;
        }
        
        int k  = arraySum - x;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxSize = 0;
        
        for(int i = 0;i<nums.length;i++) {
            sum += nums[i];
            
            if(sum == k) {
                maxSize = i+1;
            }
            
            if(map.containsKey(sum - k)) {
                maxSize = Math.max(maxSize,i-map.get(sum-k));
            }
            
            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
            
        }
        
        return   maxSize == 0 ? ( k == 0 ? n:-1) : (n-maxSize) ;
        
        
        
    }
}