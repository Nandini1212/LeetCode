/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class MoveZeros {
    public static void moveZeros(int [] nums){
        int count = 0;
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != 0){
                nums[count] = nums[index]; //count is incremented
                count++;
            }
        }
        //after complete traversal all non zero elements shifted
        //to left and count is set as index of first 0 and
        //make all elements 0 from count to end
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
    }
    public static void main(String [] args){
        int [] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZeros(arr);
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    
}
