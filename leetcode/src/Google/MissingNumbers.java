/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author nandini
 */
public class MissingNumbers {
        public static List<String> findMissingNumbers(int[] nums, int lower, int upper) {
            HashSet<Integer> set = new HashSet<Integer>();
            List<String> arr = new ArrayList<String>();
            for(int index = 0; index < nums.length; index++){
                set.add(nums[index]);                    
                
            }
            for(int index = lower; index <= upper; index++) {
               if(!set.contains(index)){
                   arr.add(String.valueOf(index));
               }
            }
        
            
            return arr;
        }
        public static void main(String [] args) {
            int nums[] = {1,3,5,4};
            System.out.println(findMissingNumbers(nums,1,10));
        }

    
}
