package dynamicprograming;



//https://leetcode.com/problems/partition-equal-subset-sum/

public class PartitionEqualSubsetSum {


    public static boolean canPartition(int[] nums) {

        int sum = 0;

        for(int num:nums) {
            sum += num;
        }

        if(sum%2 == 1) return false;

        int target = sum/2;

        boolean[][] dp  = new boolean[nums.length+1][target+1];



        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = true;

                } else if(i == 0) {
                    dp[i][j] = false;

                } else if(j == 0) {
                    dp[i][j] = true;

                }else {

                    if(dp[i - 1][j]) {
                        dp[i][j] = true;
                    } else {
                        int value = nums[i-1];
                        if(j >= value ){
                            if(dp[i - 1][j - value]){
                                dp[i][j] = true;
                            }
                        }
                    }

                }
            }
        }


        return dp[nums.length][target];



    }

    public static void main(String[] args) {

        int[]arr = new int[] {1,2,3,5};

        System.out.println(canPartition(arr));





    }



}
