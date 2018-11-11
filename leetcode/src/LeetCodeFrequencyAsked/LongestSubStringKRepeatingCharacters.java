/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class LongestSubStringKRepeatingCharacters {
    
    public static int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0){
            return 0;
        }
        if (k <= 1){
            return s.length();
        }
        if (s.length() < k){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);                
            } else {
               map.put(s.charAt(i), 1); 
            }
        }
        
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) < k) {
                sb.setCharAt(i, ',');
            }
        }
        String[] strings = sb.toString().split(",");
        if (strings.length == 1){
            return strings[0].length();
        }
        int longest = 0;
        for (String st: strings) {
            longest = Math.max(longest, longestSubstring(st, k));
        }
        return longest;
    }
    public static void main(String[]args){
        String s = "aaabb";
        int k = 3;
        System.out.println(longestSubstring(s, k));
    }
}
