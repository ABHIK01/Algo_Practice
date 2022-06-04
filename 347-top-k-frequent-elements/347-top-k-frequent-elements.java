class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet()); //1,2,3,
        
        Collections.sort(list,(a,b) -> map.get(b) - map.get(a));
        
        int index = 0;
        int[] result = new int[k];
        for(int i = 0;i<k;i++) {
            result[index++] = list.get(i);
        }
        
        return result;
        
        
    }
}