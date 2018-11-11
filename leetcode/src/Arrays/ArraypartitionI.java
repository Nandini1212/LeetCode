/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 Solution: First sort the input array, then pair up elements next to each other that way we dont
        loose much to Math.min() between pair  
 */
public class ArraypartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            sum = sum + Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
