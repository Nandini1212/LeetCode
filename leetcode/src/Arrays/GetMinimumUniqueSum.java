/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nandini
 */
public class GetMinimumUniqueSum {
    public static int getMinimumUniqueSum(int[]arr){
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
            set.add(arr[i]);

            } 
            
        }
        int [] nums = new int[set.size()];
        int index = 0;
        for(int temp : set){
            nums[index] = temp;
            index++;
        }

        for (int i=0; i < nums.length; i++) {
            System.out.println("arr i :" + arr[i]);            
            sum += (nums[i] * (i+1) * (nums.length - i)); 
            
        }
        
        System.out.println(sum);
        return sum;
    }
    public static void main(String[]args){
        int[]arr = {3,1,2,2};
        System.out.println(getMinimumUniqueSum(arr));
    }
}
