class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mag = new HashMap<>();
         HashMap<Character,Integer> ran = new HashMap<>();
        
        for(Character c:magazine.toCharArray() ) {
            mag.put(c,mag.getOrDefault(c,0)+1);
        }
        
        for(Character c:ransomNote.toCharArray() ) {
            ran.put(c,ran.getOrDefault(c,0)+1);
        }
        
        
      
        for(Character c : ran.keySet()){
            if(!mag.containsKey(c) || ran.get(c) > mag.get(c) ){
              return false;
            }
        }
        
        return true;
        
    }
}