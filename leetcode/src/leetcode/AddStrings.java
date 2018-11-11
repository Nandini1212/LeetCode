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
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int num1Len = num1.length() - 1;
        int num2Len = num2.length() - 1;
        int carry = 0;
        String result = "";
        while(num1Len >= 0 || num2Len >= 0 || carry == 1) {
            long sum = 0;
            if(num1Len >= 0) {
                sum += (num1.charAt(num1Len) - '0');
                num1Len--;
            }
            if(num2Len >= 0) {
                sum += (num2.charAt(num2Len) - '0');
                num2Len--;
            }
            sum += carry;
            carry = (int)(sum) / 10;
            sum = sum % 10;
            result = String.valueOf(sum) + result;
        }
        return result;
    }
    
    public static void main(String[] args) {
        String num = "5";
        String num2 = "8";
        System.out.println(addStrings(num, num2));
    }
}
