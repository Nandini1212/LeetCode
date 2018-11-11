/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class PositionsOfLargeGroups {
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new LinkedList<>();   
        int startPointer = 0;
        int endPointer = S.length();
        for(int index = 0; index < endPointer; index++) {
            if(index == endPointer - 1 ||  S.charAt(index) != S.charAt(index + 1)) {
                if(index - startPointer + 1 >= 3){
                    result.add(Arrays.asList(new Integer[]{startPointer, index}));
                    
                }
                startPointer = index + 1;
            }
            
        }
        return result;

    }
    public static void main(String [] args) {
        String s = "abcdddeeeeaabbbcd";
        System.out.println(largeGroupPositions(s));
    }
    
}
