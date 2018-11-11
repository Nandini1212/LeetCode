/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
https://blog.csdn.net/gqk289/article/details/76089396
 */
public class MaximumAverageSubArrayI {
    public static double findMaxAverage(int[] nums, int k) {
       double max = -Double.MAX_VALUE;
         double sum = 0 ;
         for ( int i = 0 ; i < nums.length; i++) {
             if (i < k) {
                sum += nums[i];
            } else {
                max = Math.max(max, sum);
                sum = sum - nums[i - k] + nums[i];
            }
        }
        return Math.max(max, sum) / k;
        
    }
    public static void main(String[]args){
        int[]num = {-1};
        System.out.println(findMaxAverage(num, 1));
    }
}
