/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitwise;

/**
 *
 * @author nandini
 */
public class NumberOf1Bits {
    public static int hammingWeight(int n){
        int count = 0;
        while(n != 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[]args){
        System.out.println(hammingWeight(5));
    }
}
