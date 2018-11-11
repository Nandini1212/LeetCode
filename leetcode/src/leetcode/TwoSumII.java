/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class TwoSumII {
    /* brute force
    public static int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int [] arr = new int[2];
        for(int index1 = 0; index1 < numbers.length; index1++) {
            for(int index2 = index1 + 1; index2 < numbers.length; index2++) {
                if(index1 < index2) {
                    sum = numbers[index1] + numbers[index2];
                    if(sum == target) {
                        arr[0] = index1;
                        arr[1] = index2;
                    }
                }
            }
        }
        return arr;
    }*/
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> has = new HashMap<Integer, Integer>();
        int complimented = 0;
        int [] arr = new int [2]; // because i need to add indices of two elements those sum is equal to target
         for(int index = 0; index < numbers.length; index++) {
             complimented = target - numbers[index];
             System.out.println("complimented is ini: " + complimented);
             if(has.containsKey(complimented)) {
                 System.out.println("complemented is : " + complimented +
                         ", "+ "index is "+ index + 1);
                 return new int [] {has.get(complimented),index + 1};

             }
             has.put(numbers[index],index + 1);
             System.out.println("indices are: " + numbers[index] + " " + index + 1);
         } 
         return null;
    }
    
    public static void main(String[] args) {
        int [] arr = {2,11,15,7};
        int [] fina = twoSum(arr, 9);
        System.out.println(Arrays.toString(fina));
    }
    
}
