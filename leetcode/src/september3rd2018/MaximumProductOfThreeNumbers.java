/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

/**
 *
 * @author nandini
 * O(n) Time, O(1) Space

Scan the array and compute Maximum, second maximum and third maximum element present in the array.
Scan the array and compute Minimum and second minimum element present 
* in the array.
Return the maximum of product of Maximum, second maximum and third maximum 
* and product of Minimum, second minimum and Maximum element.
Note – Step 1 and Step 2 can be done in single traversal of the array.
 */
public class MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums){
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE;
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        if(nums.length < 3){
            return -1;
        }
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = nums[i];
            } else if(nums[i] > maxB){
                maxC = maxB;
                maxB = nums[i];
            } else if(nums[i] > maxC){
                maxC = nums[i];
            }
            
            if(nums[i] < minA){
                minB = minA;
                minA = nums[i];
            } else if(nums[i] < minB){
                minB = nums[i];
            }
        }
        return Math.max(maxA * maxB * maxC,minA * minB * maxA);
    }
    public static void main(String[]args){
        int [] num = {1,2,3,4};
        System.out.println( maximumProduct(num));
    }
}
