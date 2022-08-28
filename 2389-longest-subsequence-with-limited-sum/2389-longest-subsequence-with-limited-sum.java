class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int length = queries.length;
        int index = 0;
        int[] ans = new int[length];
        
        for(int i = 0;i<queries.length;i++) {
            
            int count = 0;
            int sum = 0;
            for(int j = 0;j<nums.length;j++){
                sum += nums[j];
                count++;
                if(sum<= queries[i]){
                    ans[i] = count;
                    
                }
                
            }
            
        }
        
        
        
        return ans;
        
        
        
    }
}