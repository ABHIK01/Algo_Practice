class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums1) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index = 0;
        for(int num:nums2) {
            if(map.containsKey(num) && map.get(num) > 0){
                nums1[index++] = num;
                map.put(num,map.getOrDefault(num,0)-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,index);
        
    }
}