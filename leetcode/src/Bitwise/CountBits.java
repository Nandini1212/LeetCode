/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitwise;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class CountBits {
    public static int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            f[i] = f[i >> 1] + (i & 1);
        }
        return f;
    }
    public static void main(String[]args){
        System.out.println(Arrays.toString(countBits(2)));
    }
}
