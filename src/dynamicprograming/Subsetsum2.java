package dynamicprograming;

public class Subsetsum2 {

    public static boolean solve(int[] arr, int sum) {
        int n = arr.length;


        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                } else if(i == 0){ //by 0 we can't  form any sum
                    dp[i][j] = false;
                } else if(j == 0){ //empty array by 0
                    dp[i][j] = true;

                }else {
                    if(arr[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    } else if(arr[i-1] <=j) {
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                    }
                }

            }
        }

        return dp[n][sum];




    }
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 30;

        System.out.println(solve(arr,sum));




    }
}
