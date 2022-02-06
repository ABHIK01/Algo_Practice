package dynamicprograming;

public class Countsubsetsum {

    public static int solve(int[] arr, int sum) {
        int n = arr.length;


        int[][] dp = new int[n+1][sum+1];

        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                } else if(i == 0){ //by 0 we can't  form any sum
                    dp[i][j] = 0;
                } else if(j == 0){ //empty array by 0
                    dp[i][j] = 1;

                }else {
                    if(arr[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    } else if(arr[i-1] <=j) {
                        dp[i][j] = dp[i-1][j] +  dp[i-1][j-arr[i-1]];
                    }
                }

            }
        }

        return dp[n][sum];


    }

    public static void main(String[] args) {

        int n = 4;
        int[] arr = { 2, 3, 5, 6, 8, 10};
        int sum = 10;

        System.out.print(solve(arr, sum));
    }
}
