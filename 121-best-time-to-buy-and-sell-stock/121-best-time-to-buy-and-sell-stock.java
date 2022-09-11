class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profitItSellToday = 0;
        for(int  i = 0;i<prices.length;i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            
            profitItSellToday = prices[i] - minPrice;
            if(profitItSellToday > maxProfit){
                maxProfit = profitItSellToday;
            }
            
        }
        
        return maxProfit;
        
    }
}