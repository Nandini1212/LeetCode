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
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int [] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        if(candidates == null || candidates.length == 0){
            return result;
        }
        Arrays.sort(candidates);
        List <Integer> combination = new ArrayList<Integer>();
        toFindCombinationsToTarget(result, combination, candidates, target,
                0);
        return result;
    }
    
    public static void toFindCombinationsToTarget(List<List<Integer>> list,
            List<Integer> combination, int [] candidates,
            int target, int startIndex){
        
        if(target == 0){
            list.add(new ArrayList<>(combination));
            return;
        }
        for(int i = startIndex; i < candidates.length; i++){
            if(candidates[i] > target){
                break;
            }
            combination.add(candidates[i]);
            toFindCombinationsToTarget(list, combination, candidates,
                    target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }
    }
    public static void main(String[]args){
        int [] nums = {2,3,6,7};
        System.out.println(combinationSum(nums, 7));
    }
}
