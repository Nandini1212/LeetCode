package September6th2018;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class SubSetii {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        if(nums.length == 0 || nums == null){
            return list;
        }
        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        forfindAllSubsets(list, subset, nums, 0);
        return list;
    }
    public static void forfindAllSubsets(List<List<Integer>>list, List<Integer>subset, int[]nums, int startIndex){
        list.add(new ArrayList<>(subset));
        for(int i = startIndex; i < nums.length; i++){
            if(i != startIndex && nums[i - 1] != nums[i]){
                continue;
            }
                subset.add(nums[i]);
                forfindAllSubsets(list, subset, nums, i + 1);
                subset.remove(subset.size() - 1);
            
        }
    }
    public static void main(String[]args){
        int [] nums  = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
