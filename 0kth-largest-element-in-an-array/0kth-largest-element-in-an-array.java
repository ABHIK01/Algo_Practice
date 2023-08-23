class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//3,2,1,5,6,4 k = 2
        //3,2,1 -> 2,3-> 3,5-> 5,6->-> 5,6
        for(int i = 0;i<nums.length;i++) {
            pq.add(nums[i]);
            if(pq.size() > k) {
                pq.remove();
            }
        }
        return pq.peek();
        
    }
}