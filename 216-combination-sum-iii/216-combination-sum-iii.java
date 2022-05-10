class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> smallList = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        comb(k,n,1);
        return result;
    }
    
    public void comb(int k,int sum,int start) {
        if(sum == 0 && k == 0) {
            result.add(new ArrayList<>(smallList));
            return;
        }
        if(sum < 0) {
            return;
        }
        
        for(int i = start;i<10;i++) {
            smallList.add(i);
            int remain = sum  - i;
            comb( k-1, remain, i+1);
            smallList.remove(smallList.size()-1);
            
        }
    }
}