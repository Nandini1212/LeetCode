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
public class GroupPositive {
    
    public static int[] grouping(int [] nums) {
        int [] arr = new int[nums.length];
        int temp = 0;
        int j = 0;
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] < 0) {
                temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;  
                j++;
            } 
            
        }
        
        return arr;
    }
    

    public static void main(String [] args) {
        int [] num = {5,-1,2,-5,1};
        grouping(num);
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
			
    }
}
    

