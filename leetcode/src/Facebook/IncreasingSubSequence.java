/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *When recursively, it passes an index value to the recursive function ,
 * records the first address of the array to be traversed, and 
 * then compares this value with the last value of the ascending subsequence. 
 * If it is greater than the value, it will be added to the next recursive call, 
 * otherwise the index will be added. Repeat the above process.


 * @author nandini
 */
public class IncreasingSubSequence {
    public static List<List<Integer>> findSubsequences(int[] nums) {
         Set<List<Integer>> res= new HashSet<List<Integer>>();
         List<Integer> holder = new ArrayList<Integer>();
         findSequence(res, holder, 0, nums);
                  System.out.println("holder values are :" + holder);
         List result = new ArrayList(res);
         return result;
     }

    public static void findSequence(Set<List<Integer>> res, List<Integer> holder, int index, int[] nums) {
        if (holder.size() >= 2) {
            res.add(new ArrayList(holder));            
        }
        for (int i = index; i < nums.length; i++) {
            if(holder.size() == 0 || holder.get(holder.size() - 1) <= nums[i]) {
                holder.add(nums[i]);
                findSequence(res, holder, i + 1, nums);
                holder.remove(holder.size() - 1);
            }
        }
    }
    public static void main(String [] args){
        int [] arr = {1,2,3};
        System.out.println(findSubsequences(arr));
    }
    
}
