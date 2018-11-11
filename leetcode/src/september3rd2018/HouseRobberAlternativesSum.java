/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

/**
 *
 * @author nandini
 * We can use two variables, even and odd, to track the maximum value so far 
 * as iterating the array. 
 */
public class HouseRobberAlternativesSum {
    public static int rob(int [] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int evenSum = 0;
        int oddSum = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                evenSum += nums[i];
                evenSum = Math.max(evenSum, oddSum);
            } else {
                oddSum += nums[i];
                oddSum = Math.max(evenSum, oddSum);
            }
            
        }
        return Math.max(evenSum, oddSum);
    }
    public static void main(String[]args){
        int [] num = {2,1,1,2};
        System.out.println(rob(num));
    }
}
