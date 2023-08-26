class Solution {
    public int firstUniqChar(String s) {
        
        /**
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
            
            if(!set.contains(c) && s.indexOf(c,i+1) < 0){
                return i;
            }
            
            set.add(c);
        }
        
        return -1;
        */
        /*
        char str[] = s.toCharArray();
        for(int i = 0;i<s.length();i++) {
            if(s.indexOf(str[i]) == s.lastIndexOf(str[i])) {
                return i;
            }
        }
        return -1;
        */
        
   
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int i = 0;i<s.length();i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    
 
}