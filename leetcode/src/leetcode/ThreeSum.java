/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nandini
 */

//All of the digits in the array or unique or not. if all are unique this problem really simple
//our output can have duplicates or not

public class ThreeSum {
    public static List<List<Integer>>sum(int[]num){
        
  
        Arrays.sort(num);
        LinkedList<List<Integer>> ret = new LinkedList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1;
            int end = num.length - 1;
            while (start < end) {
                if (num[i] + num[start] + num[end] == 0) {
                    LinkedList<Integer> oneResult = new LinkedList<>();
                    oneResult.add(num[i]);
                    oneResult.add(num[start]);
                    oneResult.add(num[end]);
                    set.add(oneResult);
                    start++;
                    end--;
                } else {
                    if (num[i] + num[start] + num[end] < 0)
                        start++;
                    else
                        end--;
                }
            }
        }
        ret.addAll(set);
        return ret;
}
    public static void main(String[]args){
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(sum(arr));
    }

}
