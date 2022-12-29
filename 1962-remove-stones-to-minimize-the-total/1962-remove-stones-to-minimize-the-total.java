class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        
        for(int pile:piles) {
            maxHeap.add(pile);
            
        }
        
        for(int i = 0;i<k;i++) {
            int maxValue = maxHeap.poll();
            int operatedValue = (int) Math.floor(maxValue/2);
            int remainValue = maxValue-operatedValue;
            maxHeap.add(remainValue);
        }
        
        int result = 0;
        for(int num:maxHeap) {
            result += num;
        }
        
        return result;
        
        
        
    }
}