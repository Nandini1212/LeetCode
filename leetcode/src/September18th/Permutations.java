/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nandini
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return list;
        }
        Arrays.sort(nums);
        List<Integer> subList = new ArrayList<Integer>();
        
        helper(list,subList, nums);
        return list;
        
    }
    
    public static void helper(List<List<Integer>> list, List<Integer>subList, int[]nums){
        if(subList.size() == nums.length){
            list.add(new ArrayList<Integer>(subList));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }
            subList.add(nums[i]);
            helper(list, subList, nums);
            subList.remove(subList.size() - 1);
            
            
        }
    }
    public static void main(String[]args){
        int [] nums = {1,1,2};
        System.out.println(permute(nums));
    }
}
