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
public class LongestSubstrintWithAtleastKRepeatingChars {
    public static int longestSubstring(String s, int k){
        if (s == null || s.length() == 0 || k == 0){
            return 0;
        }
       int max = 0;
       int[] count = new int[26];
       int res = 0;
       for (int i = 0; i < s.length(); i++) {
           count[s.charAt(i) - 'a']++;
       }
       List<Integer> list = new ArrayList<Integer>();
       for (int i = 0; i < s.length(); i++) {
           if (count[s.charAt(i) - 'a'] < k) list.add(i);
       }
       if (list.size() == 0){
           return s.length();
       }
       list.add(0, -1);
       list.add(s.length());
       for (int i = 1; i < list.size(); i++) {
           int start = list.get(i-1) + 1;
           int end = list.get(i);
           int next = longestSubstring(s.substring(start, end), k);
           res = Math.max(res, next);
       }
       return res;
    }
    public static void main(String []args){
        String s = "pwwkew";
        System.out.println(longestSubstring(s, 2));
    }
}
