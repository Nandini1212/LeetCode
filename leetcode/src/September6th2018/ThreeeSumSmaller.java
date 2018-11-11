/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

import java.util.Arrays;

/**
 *
 * Time O(N^2) space O(1)
 * 
 * similar to 3 sum, but ofcourse, this one check on '<' so we can not use HashMap anymore.
Basic concept is to fix first number, then check for the rest two numbers, see if they addup < target.
When checking left and right, realize something nice:
	if nums[left] + nums[right] < target - nums[i], that means for all index <= right will work, 
        * so directly add (right - left) to result (that's: index = left+1, left+2, ....,right)
	also, move j forward for next round.
OR, if three-add-up >= target, since left can only increase, we do right-- to make the three-add-up smaller
* The solution to the problem is the same as 3SUM , which first sorts the entire array, 
* then an outer loop determines the first number,
* and then uses the head and tail pointers left and right to clamp, 
* resulting in the sum of the three numbers. 
* If the sum is greater than or equal to the target number, 
* the three numbers we selected are a bit large,
* and the tail pointer is right forward (because it is a sorted array, 
* so the forward direction will definitely become smaller). 
* If this sum is less than the target number, then there is a right-left valid result. why?
* Because we assume that we fix the outer number at this time, 
* and the number pointed to by the left pointer is unchanged,
* then the tail pointer is shifted to the left by 0 bits until the left is moved to the left one. 
* These combinations are smaller than the target number. of.



 */
public class ThreeeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums == null || nums.length <= 2){
            return 0;
        }
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] >= target){
                    right--;
                } else {
                    result += (right - left);
                    left++;
                }
            }
        }
        return result;
    }
    
}
