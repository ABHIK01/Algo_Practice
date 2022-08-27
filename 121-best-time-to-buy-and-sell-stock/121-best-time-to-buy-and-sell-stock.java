class Solution {
    public int maxProfit(int[] prices) {
        /*
       int profit = 0;
        int maximumProfit = 0;
        for(int i = 0; i<prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] > prices[i]){
                    profit = prices[j] - prices[i];
                    if(profit > maximumProfit){
                        maximumProfit = profit;
                    }
                }
            }
        }
        return maximumProfit;
        */
        
       /*
       int lsf = Integer.MAX_VALUE;
        
        int overallProfit = 0;
        int pist = 0;
        for(int i = 0;i<prices.length;i++) {
            if(prices[i] < lsf)
                lsf = prices[i];
            pist = prices[i] - lsf;
            
            if(pist > overallProfit)
                overallProfit = pist;
        }
        
        return overallProfit;
        */
        
        
        int minPrice  = Integer.MAX_VALUE;
        int maxProfit = 0;
            
        int pist = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            pist = prices[i] - minPrice;
            if(pist > maxProfit) {
                maxProfit = pist;
            }
        }
        return maxProfit;
        
    }
}