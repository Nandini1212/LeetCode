/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

/**
 *
 * @author nandini
 */
public class ReverseAnInteger {
    public static int reverse(int x) {
        boolean negative = false;
        if(x < 0) {
            negative = true;
            x = -x;
        }
        
        int reverseNum = 0;
        int prev_num = 0;
        while(x != 0) {
            int current = x % 10;//extract right most number out
            reverseNum = reverseNum * 10 + current;
            if((reverseNum - current) /10 != prev_num) {
                System.out.println("overflow");
                return 0;
            }
            prev_num = reverseNum;
            x /= 10;
        }
        if(negative == true) {
            return -reverseNum;
        }
        return +reverseNum;
        
    }
    public static void main(String args[]) {
        int num = -123;
        System.out.println(reverse(num));
    }
    
}
