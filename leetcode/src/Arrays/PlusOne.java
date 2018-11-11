/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[]result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[]args){
        int[]srr = {1,2,3};
        System.out.println(Arrays.toString(plusOne(srr)));
    }
}
