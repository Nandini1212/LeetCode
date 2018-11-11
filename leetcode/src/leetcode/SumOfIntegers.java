/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author nandini
 */
/* first we have to find carry for all the positions
then ignore carry we have to add all digits
then shit the carry to the next digit position
*/
public class SumOfIntegers {
    public int getSum(int a, int b) {
        while(b!=0) {
            int carry = a & b;
            a = a ^ b;
            b = carry<<1;
        }
        return a;
    }
    public static void main(String[]args) {
        SumOfIntegers sum = new SumOfIntegers();
        System.out.println(sum.getSum(6, 7));
        
    }
}
