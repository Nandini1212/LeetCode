/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September4th2018;

/**
 * If we use an array dp[] to store the cost value required to reach each layer.
 * Then the final result is to find the value of dp[cost.length]. 
 * Since one or two layers can be taken each time, 
 * and can start from 0 or from 1, it is possible to obtain dp[0] as 0 and dp[1] as 0.
 * Starting from 2, dp[i] can be reached by going through 2 layers through dp[i-2]
 * or one layer through dp[i-1], and the values ​​of the i-2 and i-1 layers are respectively 
 * cost [i-2] and cost[i-1], so, dp[i] = min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]). 
 * The space complexity of the algorithm is O(n) and the time complexity is O(n) .
 *Since i is greater than or equal to 2, dp[i] is only related to dp[i-1] and dp[i-2] to the cost
 * array. So we only need to use three variables to store the result,
 * that is dp0,dp1,dp2, the space complexity becomes O(1) .
 * @author nandini
 */
public class minCostClimibing {
    public static int minCostClimbingStairs(int[] cost) {
        int length = cost.length + 1;
        int dp0 = 0;
        int dp1 = 0;
        int dp2 = 0;
        for (int i = 2; i < length; i++) {
            dp2 = Math.min(dp0 + cost[i - 2] , dp1 + cost[i - 1]);
            dp0 = dp1;
            dp1 = dp2;
        }
        return dp2;
    }
    public static void main(String[]args){
        int[]cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
       
    }
}
