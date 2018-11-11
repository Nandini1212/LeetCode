
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class DuplicateNumber {
    public static int duplicateNum(int[]nums) {
       int [] arr = new int[nums.length];
        for(int index = 0; index < nums.length; index++) {
        if(nums[Math.abs(nums[index])] > 0){
            nums[Math.abs(nums[index])] = -nums[Math.abs(nums[index])];
        } else {
            arr[index] = Math.abs(nums[index]);
        }
        }
        
        int value = 0;
for (int i = 0; i < arr.length; i++)
{
    value = arr[i]; // Build out the number as a string
}


        return value;
    }
    public static void main(String args[]) {
        int[] nums = {3,1,2,1,3,4,5,3};
        System.out.println(duplicateNum(nums));
    }
    
}
