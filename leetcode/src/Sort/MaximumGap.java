/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class MaximumGap {
    //non  linear time
    public static int maximumGap(int[]nums){
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for(int i = 1; i < nums.length - 1; i++){
            max = Math.max(max, nums[i + 1] - nums[i]);
        }
        return max;
    }
    public static void main(String[]args){
        int [] arr = {3,6,9,1};
        System.out.println(maximumGap(arr));
    }
}
