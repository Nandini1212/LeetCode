/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.Arrays;

/**
 *
 * @author nandini
 * https://leetcode.com/problems/longest-increasing-subsequence/solution/
 * time complexity : O(n logn) 
 * space : O(n)
 */
public class LongestIncreasingSubsequence {
     public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            
            if (i < 0) {
                i = -(i + 1);
                
            }
            dp[i] = num;
            
            
            if (i == len) {
                //System.out.println("dp[i] is :" +dp[i]);
                System.out.println("i is :" + i);
                len++;
                System.out.println("dp[i] is :" +dp[i]);
                
            }
        }
        return len;
    }
     public static void main(String[]args){
         int [] nums = {10,9,2,5,3,7,101,18};
         System.out.println("nums : " + Arrays.toString(nums));
         
         System.out.println("lenght is :" + lengthOfLIS(nums));
         
     }
             
             
}
