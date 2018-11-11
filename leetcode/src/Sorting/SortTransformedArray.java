/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class SortTransformedArray {
        public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {
            int [] result = new int[nums.length];
            for(int index = 0; index < nums.length; index++) {
                
                result[index] = apply(nums[index],a,b,c);
            }
            Arrays.sort(result);
            return result;
        }

    private static int apply(int num, int a, int b, int c) {
        return a*num*num + b* num + c;
    }
    public static void main(String[] args) {
        int[]arr= {-4,-2,2,4};
        int[] result = sortTransformedArray(arr, -1,3,5);
        System.out.println(Arrays.toString(result));
    }

    
}
