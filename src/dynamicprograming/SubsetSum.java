package dynamicprograming;



//https://www.interviewbit.com/problems/subset-sum-problem/

//dynamic problem
//example



public class SubsetSum {

    public static int  existSubsetSum(int[] A, int B) {



        if(subsetsum(A,B))
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }

    public static boolean subsetsum(int[] A, int B) {
        int n = A.length;
        boolean[][] dp = new boolean[n+1][B+1];//

        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = true;

                }else if(i == 0) {
                    dp[i][j] = false;

                }else if(j == 0) {
                    dp[i][j] = true;

                } else {
                    if(dp[i - 1][j]) {
                        dp[i][j] = true;
                    } else {
                        int value = A[i-1];
                        if(j >= value) {
                            if(dp[i - 1][j - value]){
                                dp[i][j] = true;

                            }
                        }
                    }
                }
            }
        }

        return dp[n][B];

    }

    public static void main(String[] args) {

        int[] A = new int[] {1,2,3,4,5};
        int B = 7;

        System.out.println( existSubsetSum(A, B));



    }
}
