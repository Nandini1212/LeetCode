/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

/**
 *
 * @author nandini
 */
public class CoinChange {
    /*
    static void makeChange(int C, int[] intDenominations){
        System.out.println(coinChange(C, intDenominations));
    }*/
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (coins == null || coins.length == 0)
            return -1;
            
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                //System.out.println("dp values:" + dp[i]);
                if (i >= coins[j] && dp[i - coins[j]] != -1){

                    min = Math.min(min, dp[i - coins[j]] + 1);
                }
               System.out.println(i  + " " + (i - coins[j]));
            }

            dp[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return dp[amount];
}
     public static void main(String[]args){
        int [] nums = {1,2,3};
        int amount = 4;
        System.out.println(coinChange(nums,amount));
    }
    
}
