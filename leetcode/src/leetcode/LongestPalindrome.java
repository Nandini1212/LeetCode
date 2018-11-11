/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashSet;

/**
 *
 * @author nandini
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        char [] ch = s.toCharArray();
        int count = 0;
        String result = "";
        HashSet<Character>has = new HashSet<Character>();
        for(int index = 0; index < s.length(); index++) {
            if(has.contains(s.charAt(index))) {
                has.remove(s.charAt(index));
                count++;
            } else {
                has.add(s.charAt(index));
                System.out.println(s.charAt(index));
            }
            //System.out.println(has.contains(s.charAt(index)));
        }
     
        if(!has.isEmpty()) {
            return count * 2 + 1;
        }
        return count *2;
    }
    public static void main(String[] args) {
        String s = "abcbaabcaaaa";
        int length = longestPalindrome(s);
        System.out.println("length is:" + length);
        
        
    }
    
}
