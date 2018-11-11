/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class PalindromicSubStrings {
    int count = 0;
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        for(int i = 0; i < s.length(); i++){
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i + 1);
            
        }
        return count;
            
    }
    public void checkPalindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            count++;
        }
    }
    public static void main(String[] args){
        PalindromicSubStrings ps = new PalindromicSubStrings();
        String s = "aba";
        System.out.println(ps.countSubstrings(s));
    }

}
