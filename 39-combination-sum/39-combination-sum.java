class Solution {
    List<Integer> smallList;
    List<List<Integer>> ans;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         ans = new ArrayList<>();
        smallList = new ArrayList<>();
        
        combination(candidates,target,smallList,ans,0);
        return ans;
        
    }
    
    void combination(int[] candidate,int target,List<Integer> smallList, List<List<Integer>> ans,int startIndex){
        if(target < 0) {
            return;
        }
        if(target == 0) {
            ans.add(new ArrayList<>(smallList));
        }
        
        for(int i = startIndex;i<candidate.length;i++) {
            smallList.add(candidate[i]);
            int remainSum = target  - candidate[i];
            combination(candidate,remainSum,smallList,ans,i);
            smallList.remove(smallList.size()-1);
        }
    }
    
}