class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, result, 0,new ArrayList<Integer>()); 
        
        return result;
        
    }
    
    public void backtrack(int[] nums,List<List<Integer>> result,int index,List<Integer> smallList) {
        
        if(index == nums.length) {
            result.add(new ArrayList<Integer>(smallList));
            return;
        }
        
        
        
        
       
         
        //include
        smallList.add(nums[index]);
         backtrack(nums,result,index+1,smallList);
        smallList.remove(smallList.size()-1); //backtrcak 
        
           //exclude
        while( index+1 < nums.length && nums[index] == nums[index+1]) {
            index++;
        }
        backtrack(nums,result,index+1,smallList);
       
        
    
    }
}

 