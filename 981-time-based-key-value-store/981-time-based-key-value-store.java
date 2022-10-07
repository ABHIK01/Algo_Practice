class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map = new HashMap<String,TreeMap<Integer,String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {
            TreeMap<Integer,String> map2 = new TreeMap<>();
            map2.put(timestamp,value);
            map.put(key,map2);
        } else {
            map.get(key).put(timestamp,value);
        }
    }
    
    public String get(String key, int timestamp) {
        
        if (!map.containsKey(key)) {
            return "";
        }
        Integer floorKey = map.get(key).floorKey(timestamp);
        if(floorKey != null){
            return map.get(key).get(floorKey);
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */