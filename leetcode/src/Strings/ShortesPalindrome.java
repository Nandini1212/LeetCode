/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author nandini
 */
public class ShortesPalindrome {
    public static String shortestPalindrome(String s) {
         int i = 0, end = s.length() - 1, j = end;
         char []arr = s.toCharArray();
         while (i < j) {
             System.out.println("arr[i] :" + i + ", " + "arr[j] :" + j);
             if (arr [i] == arr[j]) {
                 
                 ++i; -- j;
            } else {
                i = 0; --end; j = end;
            }
        }

        return  new StringBuilder(s.substring(end + 1)).reverse().toString() + s;
    }
    public static void main(String[]args){
        String s = "abcd";
        System.out.println(shortestPalindrome(s));
    }
}
