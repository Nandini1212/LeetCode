/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class CombinationsSumIII {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer>subList = new ArrayList<Integer>();
        helper(list, subList, n, k, 1);
        return list;
    }
    public static void helper(List<List<Integer>>list, List<Integer>subList, int n, int k, int start){
        
        if(n < 0){
            return;
        }
        if(n == 0 && subList.size() == k){
            list.add(new ArrayList<Integer>(subList));
            return;
        }
        for(int i = start; i <= 9; i++){
            subList.add(i);
            helper(list, subList, n - i, k, i + 1);
            subList.remove(subList.size() - 1);
        }
    }
    public static void main(String[]args){
        int n = 9;
        int k = 3;
        System.out.println(combinationSum3(k,n));
    }
}
