class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> answer = new ArrayList<>();
        for(String word:words) {
            if(check(word,pattern)){
                answer.add(word);
            }
        }
        
        return answer;
        
    }
    
    boolean check(String word,String pattern) {
        for(int i = 0;i<word.length();i++) {
            if(word.indexOf(word.charAt(i)) !=  pattern.indexOf(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
}