class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2  ==1) {
            return new int[0];
        }
        Arrays.sort(changed);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int elem:changed) {
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        
        int[] res = new int[changed.length/2];
        int index = 0;
        
        for(int i = 0;i<changed.length;i++){
            if(map.containsKey(changed[i])){
                if(map.containsKey(2 * changed[i])){
                    res[index++] = changed[i];
                    
                    map.put(changed[i],map.get(changed[i])-1);
                    map.put(changed[i] *2,map.get(changed[i]*2)-1);
                    
                    if(map.get(changed[i]) <= 0) {
                        map.remove(changed[i]);
                    }
                    
                     if( map.containsKey(changed[i] *2) &&  map.get(changed[i] *2) <= 0) {
                        map.remove(changed[i]*2);
                    }
                }
                else {
                return new int[0];
            }
            }
        }
        
        return res;
        
    }
}