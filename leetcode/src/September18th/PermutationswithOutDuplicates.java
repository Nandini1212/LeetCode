/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nandini
 */
public class PermutationswithOutDuplicates {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length == 0|| nums == null){
            return list;
        }
        Arrays.sort(nums);
        boolean [] visited = new boolean[nums.length];
        List<Integer>sub = new ArrayList<Integer>();
        helper(list, sub, nums, visited);
        return list;
    }
    /*
    public static void helper(List<List<Integer>>list, List<Integer>subList, int[]nums, boolean [] visited){
        if(subList.size() == nums.length){
            list.add(new ArrayList<Integer>(subList));
            return;
        }
        for(int i = 0; i < nums.length; i++){

            if(visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])){
                continue;
            }
            visited[i] = true;
            subList.add(nums[i]);
            helper(list, subList, nums, visited);
            subList.remove(subList.size() - 1);
            visited[i] = false;
            
        }
    }*/
    public static void helper(List<List<Integer>>list, List<Integer>subList, int[]nums, boolean [] visited){
        if(subList.size() == nums.length){
            list.add(new ArrayList<Integer>(subList));
            return;
        }
        Set<Integer> tempSet = new HashSet<Integer>();
        Set<Integer> indexSet = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){

            if(indexSet.contains(i)){
                continue;
            }
            if(tempSet.contains(nums[i])){
                continue;
            }
            
            subList.add(nums[i]);
            indexSet.add(i);
            tempSet.add(nums[i]);
            helper(list, subList, nums, visited);
            subList.remove(subList.size() - 1);
            indexSet.remove(i);
            
        }
    }
    public static void main(String[]args){
        int [] nums = {1,1,2};
        System.out.println(permuteUnique(nums));
    }
}
