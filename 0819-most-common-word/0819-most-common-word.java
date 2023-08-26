class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if(paragraph == null || paragraph.length() == 0){
            return "";
        }
        
        Set<String> bannedSet  = Arrays.stream(banned).collect(Collectors.toSet());
        
        String words[] = paragraph.replaceAll("[^A-Za-z]"," ").toLowerCase()
            .split("\\s+");
        
        HashMap<String,Integer> freqMap = new HashMap<>();
        for(String word:words){
            if(!bannedSet.contains(word)) {
                System.out.println("word "+ word);
                freqMap.put(word,freqMap.getOrDefault(word,0)+1);
            }
        }
        
        /*
        StringBuilder ans = new StringBuilder();
        
        for (String key : freqMap.keySet()) {
            if ( ans.toString().equals("") ||freqMap.get(key) > freqMap.get(ans.toString())) {
                System.out.println("key is "+ key);
                ans.setLength(0);
                ans.append(key);
            }
   
        
    }
        return ans.toString();
        */
        return Collections.max(freqMap.entrySet(),Map.Entry.comparingByValue())
            .getKey();
            
    }
}