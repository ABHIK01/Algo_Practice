class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> hashMapS = new HashMap<>();
     
        
        for(Character c: s.toCharArray()) {
            hashMapS.put(c,hashMapS.getOrDefault(c,0)+1);
        }
        
        Map<Character,Integer> hashMapT = new HashMap<>();
     
        
         for(Character c: target.toCharArray()) {
            hashMapT.put(c,hashMapT.getOrDefault(c,0)+1);
        }
        
        
        int ans = Integer.MAX_VALUE;
        for(Character i : hashMapT.keySet())
        {
            if(hashMapS.containsKey(i))// for  handle example s = "abc" target = "abcdef"
            ans = Math.min(hashMapS.get(i)/hashMapT.get(i),ans);
            else return 0;
        }
        
        return ans;
        
    }
}