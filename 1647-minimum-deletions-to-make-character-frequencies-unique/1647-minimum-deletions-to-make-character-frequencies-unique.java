class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(Character c: s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int count = 0;
        for(Character c:map.keySet()) {
            int num = map.get(c);
            if(!set.contains(map.get(c))) {
                set.add(map.get(c));
            } else {
                while( num > 0 && set.contains(num)) {
                    num--;
                    count++;
                }
                set.add(num);
            }
        } 
        
        return count;
        
    }
}