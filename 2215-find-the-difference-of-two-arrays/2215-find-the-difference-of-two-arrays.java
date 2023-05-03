class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num: nums1) {
            set1.add(num);
        }
        
        for(int num:nums2) {
            set2.add(num);
        }
        
         Set<Integer> ans1 = new HashSet<>();
        Set<Integer> ans2 = new HashSet<>();
        
        for(int num :nums1) {
            if(!set2.contains(num)){
                ans2.add(num);
            }
        }
        
         for(int num :nums2) {
            if(!set1.contains(num)){
                ans1.add(num);
            }
        }
        
        List<Integer> list1 = new ArrayList<>(ans2);
        List<Integer> list2 = new ArrayList<>(ans1);
        ans.add(list1);
        ans.add(list2);
        
        return ans;
        
        
    }
}