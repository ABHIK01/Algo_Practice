class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(nums,result,0,new ArrayList<Integer>());
        
        return result;
    }
    
    public void  backtrack(int[] nums,List<List<Integer>> result,int start,List<Integer> smallList) {
        
        if(start == nums.length) {
            result.add(new ArrayList<>(smallList));
            return;
        }
        
        backtrack( nums,result, start+1, smallList);
        
        smallList.add(nums[start]);
         backtrack( nums,result, start+1, smallList);
        smallList.remove(smallList.size() -1);
        
        
        
    }
}