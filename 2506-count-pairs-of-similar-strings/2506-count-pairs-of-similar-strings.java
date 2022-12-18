class Solution {
    public int similarPairs(String[] words) {
        
        
        int count = 0;
       
        for(int i = 0;i<words.length-1;i++) {
            for(int j = i+1;j<words.length;j++){
                count += check(words[i],words[j]);
            }
        }
        
        return count;
    }
    
    public int check(String first,String second) {
       HashSet<Character> set1 = new HashSet<>();
         HashSet<Character> set2 = new HashSet<>();
        for(Character value:first.toCharArray()){
            set1.add(value);
        }
        for(Character value:second.toCharArray()){
            set2.add(value);
        }
        
        return set1.equals(set2) ? 1 : 0;
    }
}