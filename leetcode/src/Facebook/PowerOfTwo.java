/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 * keep dividing the number by two, i.e, do n = n/2 iteratively. 
 * In any iteration, if n%2 becomes non-zero and n is not 1 
 * then n is not a power of 2. If n becomes 1 then it is a power of 2.
 */
public class PowerOfTwo {
    
    static boolean isPowerOfTwo(int n){
        if(n == 0){
            return false;
        }
        while(n != 1){
            if(n % 2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
    public static void main(String[]args){
        if(isPowerOfTwo(0)){
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
