/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickstartDP;

import java.util.List;

/**
 *
 * @author nandini
 */
public class Makingcoinchage {
      static void makeChange(int C, int[] intDenominations) {
         
        coinChange(C, intDenominations);


    }
public static int coinChange(int amount, int[] coins) {
        if (amount == 0)
            return 0;
        if (coins == null || coins.length == 0)
            return -1;
            
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j] && dp[i - coins[j]] != -1)
                    min = Math.min(min, dp[i - coins[j]] + 1); //+means atleast one other 
            }

            dp[i] = min == Integer.MAX_VALUE ? -1 : min;
            //System.out.println(dp[i]);
        }
        System.out.println(dp[amount]);
        return dp[amount];
}
public static void findNoOfWays(int amount, int[]coins, String temp, List<String>result){
    
}
public static void main(String[]args){
    int [] deno = {1,2,3};
    int coin = 4;
    makeChange(coin, deno);
}
    
}
