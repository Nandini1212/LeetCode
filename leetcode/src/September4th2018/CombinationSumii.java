/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September4th2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nandini
 */
public class CombinationSumii {
    public static List<List<Integer>>combinationSum2(int[]candidates, int target){
        List<List<Integer>>list = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0){
            return list;
        }
        Arrays.sort(candidates);
        ArrayList<Integer>combinations = new ArrayList<Integer>();
        toFindCombinationsToTarget(list, candidates, target, combinations, 0);
        return list;
    }
    public static void toFindCombinationsToTarget(List<List<Integer>> list, int[] candidates,
            int target, List<Integer> combination, int startIndex){
        if(target == 0){
            list.add(new ArrayList<>(combination));
            return;
        }
        for(int i = startIndex; i < candidates.length; i++){
            if(i != startIndex && candidates[i] == candidates[i - 1]){ //checking for prev elements
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            combination.add(candidates[i]);
            toFindCombinationsToTarget(list, candidates, target - candidates[i], combination, i + 1);
            combination.remove(combination.size()- 1);
        }
        
    }
    public static void main(String[]args){
        int [] nums = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(nums, 8));
    }
    
}
