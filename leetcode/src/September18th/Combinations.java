/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.List;

/**
Time Complexity - O(n!)， Space Complexity - O(nk)


 */
public class Combinations {
    public static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer>subList = new ArrayList<Integer>();
        helper(list, subList, n, k, 1);
        return list;
    }
    public static void helper(List<List<Integer>>list, List<Integer>subList, int n, int k, int start){
        if(subList.size() == k){
            list.add(new ArrayList<Integer>(subList));
            return;
        }
        for(int i = start; i <= n; i++){
            subList.add(i);
            helper(list, subList, n, k, i + 1);
            subList.remove(subList.size() - 1);
        }
    }
    public static void main(String[]args){
        int n = 4;
        int k = 2;
        System.out.println(combine(n,k));
    }
}
