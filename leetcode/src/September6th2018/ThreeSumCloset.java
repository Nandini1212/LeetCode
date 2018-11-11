/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

import java.util.Arrays;

/**
 *
 * For 3Sum Closest, we are going to find the closet sum to the target. 
 * The closet sum could be the target itself or a number close to the target.

First, we can sort the array into ascending order.
Second, we declare an integer variable called closetSum. 
* That’s the final value we are going to return.
Then we can iterate all the numbers in the array. 
* Whenever visiting a number, 
* we should find two numbers in the rest of array 
* which adds the number closet to target. Once iteration finished,
* we get the result.@author nandini
 */
public class ThreeSumCloset {
    public static int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        Arrays.sort(nums);
        
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < nums.length; i++){
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while(left < right){
                
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                if(sum < target){
                    left++;
                } else {
                    right--;
                }
            }
                       
        }
        return closestSum;
    } 
    public static void main(String[]args){
        int [] nums = {-1, 2, 1, -4};
        System.out.println( threeSumClosest(nums, 1));
    }
}
