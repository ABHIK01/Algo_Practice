class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        
        int index = 0;
        if(k > n) {
            k = k%n;
        }
        
        
        for(int i =  n - k;i<n;i++){
            result[index++]  = nums[i];
        }
        for(int i = 0;i<n-k;i++) {
            result[index++] = nums[i];
        }
        
       
        System.arraycopy(result, 0, nums, 0, n);
        
    }
}