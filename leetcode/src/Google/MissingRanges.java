/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class MissingRanges {
    /*
     public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
         int prev = lower - 1;
         int current = 0;
         List <String> result = new ArrayList<String>();
         for(int index = 0; index < nums.length; index++) {
             if(index == nums.length) {
                 current = upper + 1;
             } else {
                 current = nums[index];
             }
             if(current - prev >= 2){
                 if(prev + 1 == current - 1){
                     result.add(String.valueOf(prev + 1));
                 } else {
                     result.add(String.valueOf(prev + 1) + "--->" + String.valueOf(current - 1));
                 }
                 
             }
              prev = current;
         }
        return result;
     
     }
     
     //accepted solution
*/
    public static List<String> findMissingRanges(int[] nums, int lower, int upper){
         List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            group(res, lower, upper);
            return res;
        }
        //base case
        if (nums[0] != lower) {
            group(res, lower, nums[0] - 1);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1] + 1 && nums[i] != nums[i - 1]) {
                group(res, nums[i-1] + 1, nums[i] - 1);
            }
        }
        if (nums[nums.length - 1] != upper) {
            group(res, nums[nums.length - 1] + 1, upper);
        }
        return res;
    }
    public static void group(List<String> res, int start, int end) {
        StringBuilder sb = new StringBuilder();
        if (start == end) {
            sb.append(start);
        } else {
            sb.append(start);
            sb.append("->");
            sb.append(end);
        }
        res.add(sb.toString());
    }

    
     public static void main(String[] args){
         int [] nums = {2147483647};
         System.out.println(findMissingRanges(nums, 0, 99));
     }

    
}
