/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author nandini
 * time complexity O(n)
 * O(m + n)
 */
public class NextGenerateNumberi {
    public static int[] nextgreaterElement(int[]findNums, int[]nums){
        HashMap<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);                
            }
            stack.push(num);
            
        }   
        for (int i = 0; i < findNums.length; i++){
            if(map.containsKey(findNums[i])){
                findNums[i] = map.get(findNums[i]);
            } else {
                findNums[i] = -1;
            }
            //findNums[i] = map.getOrDefault(findNums[i], -1);
           
        }
        return findNums;
    }
    public static void main(String[]args){
        int [] num1 = {4,1,2};
        int [] num2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextgreaterElement(num1, num2)));
    }
}
