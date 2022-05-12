class Solution {
    List<List<Integer>> ans;
    //List<Integer> smallList;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        //smallList = new ArrayList<>();
        int[] visited = new int[nums.length];
        helper(nums,visited,new ArrayList<>(),ans);
        return ans;
    }
    
    public void helper(int[] arr,int[] visited,List<Integer> smallList,List<List<Integer>> ans) {
        if(smallList.size() == arr.length) {
            ans.add(new ArrayList<>(smallList));
            return;
        }
        
        for(int i = 0;i<arr.length;i++) {
            if(visited[i] == 0) {
                
                smallList.add(arr[i]);
                visited[i] = 1;
                helper(arr,visited,smallList,ans);
                visited[i] = 0;
                smallList.remove(smallList.size()-1);
            }
        }
        
    }
}