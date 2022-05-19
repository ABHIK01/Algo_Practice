class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        //smallList = new ArrayList<>();
        int[] visited = new int[nums.length];
        Arrays.sort(nums); 
        helper(nums,visited,new ArrayList<>(),ans);
        return ans;
        
    }
    
      public void helper(int[] arr,int[] visited,List<Integer> smallList,List<List<Integer>> ans) {
        if(smallList.size() == arr.length) {
            ans.add(new ArrayList<>(smallList));
            return;
        }
        
        for(int i = 0;i<arr.length;i++) {
            
            //if(i > 0 && arr[i] == arr[i-1] && visited[i ] == 0) {
            //    continue;
            //}
            if(i == 0) {
                 if(  visited[i] == 0  ) {
                
                smallList.add(arr[i]);
                visited[i] = 1;
                helper(arr,visited,smallList,ans);
                visited[i] = 0;
                smallList.remove(smallList.size()-1);
           }
            } else if( arr[i] == arr[i-1] &&  visited[i-1] ==1){
                continue;
            } else {
                 if(  visited[i] == 0  ) {
                
                smallList.add(arr[i]);
                visited[i] = 1;
                helper(arr,visited,smallList,ans);
                visited[i] = 0;
                smallList.remove(smallList.size()-1);
           }
                
            }
            
                
            
        }
        
    }
    
}