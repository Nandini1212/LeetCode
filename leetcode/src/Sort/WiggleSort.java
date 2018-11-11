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
public class WiggleSort {
    public static void wiggleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(i % 2 == 0 && nums[i] > nums[i + 1]){
                swap(nums, i, i + 1);
            }
            else if(i % 2 == 1 && nums[i] < nums[i + 1]){
                swap(nums, i, i + 1);
            }
        }
    }
    public static void swap(int [] nums, int i, int j){
       
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        
    }
    public static void main(String[]args){
        int [] nums = {1,5,1,1,6,4};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
