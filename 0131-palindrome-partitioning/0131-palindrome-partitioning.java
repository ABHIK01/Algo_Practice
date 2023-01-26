class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        helper(0,s,path,result);
        return result;
        
    }
    
    public void helper(int index,String s,List<String> path,List<List<String>> result){
        if(index == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        
        for(int end = index;end<s.length();end++ ){
            if(isPalindrome(s,index,end)){
                path.add(s.substring(index,end+1));
                helper(end+1,s,path,result);
                path.remove(path.size()-1);
            }
        }
    }
    
    boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++) != s.charAt(end--) ){
                return false;
            }
        }
        return true;
    }
}