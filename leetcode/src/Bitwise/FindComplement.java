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
public class FindComplement {
    public static int findComplement(int num) {
        int res = ((Integer.highestOneBit(num)-1)<<1)+1;
        return res^num;
    }
    public static void main(String[]args){
        System.out.println(findComplement(4));
    }
}
