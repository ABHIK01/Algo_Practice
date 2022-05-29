class Solution {
    public int totalSteps(int[] nums) {
        Stack<Pair<Integer,Integer>> stack=new Stack<>();
        int ans = 0;
        
        stack.push(new Pair<>(nums[nums.length-1],0));
        
        for(int i = nums.length - 2;i>=0;i--) {
            int count = 0;
            while(!stack.isEmpty() && nums[i] > stack.peek().getKey()) {
                count = Math.max(count+1,stack.peek().getValue());
                stack.pop();
            }
            ans = Math.max(ans,count);
            stack.push(new Pair<>(nums[i],count));
            
        }
        
        return ans;
        
    }
}