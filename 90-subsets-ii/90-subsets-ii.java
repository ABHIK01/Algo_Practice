class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,result,0,new ArrayList<Integer>());
        
        return result;
        
    }
    
    void backtrack(int[] nums,List<List<Integer>> result,int start,List<Integer> smallList) {
        if(start == nums.length) {
            result.add(new ArrayList<Integer>(smallList));
            return;
        }
        
        
        smallList.add(nums[start]);
         backtrack( nums,result, start+1,smallList);
        smallList.remove(smallList.size()-1);
        
        
        
        
        while(start +1 < nums.length && nums[start] == nums[start+1]) {
            start++;
        }
        backtrack( nums,result, start+1, smallList);
        
        
    }
}