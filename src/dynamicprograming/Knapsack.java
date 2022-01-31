package dynamicprograming;

public class Knapsack {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int[] vals = new int[n];
       // int[] wts = new int[n];
/*

        for(int i = 0;i<vals.length;i++) {
            vals[i] = sc.nextInt();
        }


        for(int i = 0;i<wts.length;i++) {
            wts[i] = sc.nextInt();
        }

        int cap = sc.nextInt();
        */
            int n = 3;
          int[] vals = new int[] {60, 100, 120};
          int[] wts = new int[] {10, 20, 30};

        int cap = 50;



        int[][] dp = new int[n+1][cap+1];

        for(int i = 1;i<dp.length;i++) {
            for(int j = 1;j<dp[0].length;j++) {

                if( j>= wts[i-1]) {
                    int remainingCap = j - wts[i-1];
                    //  j = total no of ball/weight ,i-1 = remaining no of teams/items/values
                    dp[i][j] = Math.max(dp[i - 1][remainingCap] + vals[i - 1], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i-1][j]; //if i doesn't bat

                }

            }
        }

        System.out.println(dp[n][cap]);

    }
}
