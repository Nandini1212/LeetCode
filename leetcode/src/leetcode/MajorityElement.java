/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class MajorityElement {
    /*
    public static int majorityElement(int[] nums){
        int result = 0;
        int count = 0;
        for(int index = 0; index < nums.length; index++){
            if(count == 0) {
                result = nums[index];
                count = 1;
            } else if(result == nums[index]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    } */
    
    // O(NlogN)
    public static int majorityElement(int [] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
    
    public static void main(String [] args) {
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    
}
