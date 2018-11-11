/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author nandini
 */
public class NextGreaterElementCircular {
 public static int[] nextGreaterElements(int[] nums) {
        //just here same as previous problem solution but u iterate twice and then push to the stack only during 
        //the first iteration.
        //veryeasy just have to keep in mind about when to push into stack 
        int n = nums.length;
        int ret[] = new int[n];
        Arrays.fill(ret, -1);
        Stack<Integer> stack = new Stack<>(); 
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n]; 
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                ret[stack.pop()] = num;
            if (i < n) stack.push(i);
        }   
        return ret;
        
    }   
 public static void main(String[]args){
     int[]arr = {1,3,4,2};
     System.out.println(Arrays.toString(nextGreaterElements(arr)));
 }
}
