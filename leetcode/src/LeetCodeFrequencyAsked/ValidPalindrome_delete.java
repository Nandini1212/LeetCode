/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

/**
 *
 * @author nandini
 */
public class ValidPalindrome_delete {
    public static boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, false);
    }
    
   private static boolean validPalindrome(String s, int left, int right, boolean deleted) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (deleted) {
                    return false;
                }
                return validPalindrome(s, left + 1, right, true) || validPalindrome(s, left, right - 1, true);
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args){
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
    
}
