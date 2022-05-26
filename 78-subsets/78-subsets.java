class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, 0,new ArrayList<Integer>()); 
        
        return result;
        
    }
    
    public void backtrack(int[] nums,List<List<Integer>> result,int index,List<Integer> smallList) {
        
        if(index == nums.length) {
            result.add(new ArrayList<Integer>(smallList));
            return;
        }
        
        
        
        
          //exclude
        backtrack(nums,result,index+1,smallList);
        
        //
        smallList.add(nums[index]);
         backtrack(nums,result,index+1,smallList);
        smallList.remove(smallList.size()-1);
        
      
        
        
        
        
        
    }
}