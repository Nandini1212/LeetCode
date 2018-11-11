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
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        s= s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        System.out.println(s);
        for(int index = 0; index < s.length(); index++) {
            if(s.charAt(index) != s.charAt(s.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String s = "";
        System.out.println(isPalindrome(s));
    }
     
        
        
}
