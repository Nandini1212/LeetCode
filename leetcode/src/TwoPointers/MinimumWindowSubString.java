/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoPointers;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class MinimumWindowSubString {
    public static String minWindow(String s, String t) {
        if (t.length() > s.length()){
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ct : t.toCharArray()){
            map.put(ct, map.getOrDefault(ct, 0) + 1);
        }
        int counter = map.size();
        int head = 0;
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        while (end < s.length()){
            char c = s.charAt(end);
            if (map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0)
                    counter--;
            }
            end++;
            
            while (counter == 0){
                char sc = s.charAt(start);
                if (map.containsKey(sc)){
                    map.put(sc, map.get(sc) + 1);
                    if (map.get(sc) > 0)
                        counter++;
                }
                if (end - start < min){
                    head = start;
                    min = end - start;
                }
                start++;
            }
            
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(head, head + min);
    }
    public static void main(String[]args){
        String s= "abbcbcba";
        String p = "abc";
        
        System.out.println(minWindow(s, p));
    }
}
