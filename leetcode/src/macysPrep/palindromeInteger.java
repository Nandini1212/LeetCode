/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macysPrep;

import java.util.Scanner;

/**
 *
 * @author nandini
 */
public class palindromeInteger {
    
    public static boolean integerPalindrome(int number) {
       if(number < 0 ){
           return false;
       }
       
       int palindrome = number;
       int reverse = 0;
       int remainder = 0;
       while(palindrome != 0) {
           reverse = (reverse * 10) + (palindrome % 10);
           remainder /= 10;
       }
       
       if(reverse == number) {
           return true;
       }
       return false;
    }
       
       public static void main(String [] args) {
           
           int num = 2332;
           boolean palindrome = integerPalindrome(num);
           
           if (palindrome) {
            System.out.println(num+" is a palindrome");
         } else {
            System.out.println(num+" is not a palindrome");           
         }

           
       }

}
