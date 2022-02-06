package dynamicprograming;

public class UnboundedKnapsack {

    public static int solve(int[] wt, int[] val, int capacity) {
        int n = val.length;

        int[] dp = new int[capacity+1];

        dp[0] = 0;

        for(int bagC = 1;bagC<=capacity;bagC++) {
            int max = 0;
            for(int i = 0;i<n;i++) {


                if(wt[i] <= bagC) {
                    int remanCapacity = bagC - wt[i];
                    int remanBagValue = dp[remanCapacity];
                    int totalValue = remanBagValue + val[i];

                    if(totalValue> max) {
                        max = totalValue;
                    }

                }


            }
            dp[bagC] = max;

        }

        return dp[capacity];
    }
    public static void main(String[] args) {
        int[] wt = {1,3,4,5};

        int[] val = {10,40,50,70};

        int capacity = 8 ;
        System.out.println(solve(wt,val,capacity));


    }
}
