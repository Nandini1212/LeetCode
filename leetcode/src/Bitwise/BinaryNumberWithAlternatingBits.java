/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitwise;

/**
 *
 * @author nandini
 * time and space : O(1)
 */
public class BinaryNumberWithAlternatingBits {
    public static boolean hasAltrenatingBits(int n){
        String bits = Integer.toBinaryString(n);
        for(int i = 0; i < bits.length() - 1; i++){
            if(bits.charAt(i) == bits.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
}
