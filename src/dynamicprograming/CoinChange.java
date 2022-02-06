package dynamicprograming;

public class CoinChange {

    public static int coinChange(int[] coins,int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++){
                if(i == 0) {
                    dp[i][j] = amount+1;

                } else if(j == 0) {
                    dp[i][j] = 0; //if the amount is 0
                    // then we can use minimum 0 coins to  create 0 amount


                } else {
                    if(j >= coins[i-1]){
                        dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]); //if we are including then ,
                        // minimum of including of excluding
                    } else {
                        dp[i][j] = dp[i-1][j];//if we are not including
                    }

                }


            }
        }



        return dp[n][amount]>amount ?-1:dp[n][amount];
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));

    }
}
