/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 * time complexity : O(n);
 */
public class FindAllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int index = 0; index < nums.length; index++){
            if(nums[abs(nums[index])] < 0){
                list.add(abs(nums[index]));
            } else {
                nums[abs(nums[index])] = - nums[abs(nums[index])];
            }
        }
        return list;
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,1,2};
        System.out.println(findDuplicates(arr));
    }
    
}
