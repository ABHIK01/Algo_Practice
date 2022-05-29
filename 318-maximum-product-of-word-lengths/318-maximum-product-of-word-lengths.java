class Solution {
    public int maxProduct(String[] words) {
        List<Set<Character>> list = new ArrayList<>();
        int largest = 0;
        
        for(String word: words) {
            Set<Character> set = new HashSet<>();
            for(int i = 0;i<word.length();i++) {
                set.add(word.charAt(i));
            }
            list.add(set);
        }
        
        
        for(int i = 0;i<words.length;i++) {
            Set<Character> seti = list.get(i);
            for(int j = i+1;j<words.length;j++) {
              Set<Character> setj = list.get(j);
                boolean hasCommon = false;
                for(Character c:seti){
                    if(setj.contains(c)){
                        hasCommon = true;
                        break;
                    }
                }
                if(!hasCommon && ( (words[i].length() * words[j].length()) > largest) ) {
                    largest = words[i].length() * words[j].length();
                }
                    
            }
        }
        return largest;
    }
}