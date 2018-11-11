/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoPointers;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author nandini
 */
public class ShortestSubString {

    public static String minWindow(String s, HashSet<Character> set) {
        int end = 0;
        int min = Integer.MAX_VALUE;
        String result = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                int c = map.containsKey(ch) ? map.get(ch) + 1 : 1;
                if (c == 1) {
                    count++;
                }
                map.put(ch, c);
            }

            while (set.size() == count) {
                if (set.contains(s.charAt(end))) {
                    if (map.get(s.charAt(end)) - 1 == 0) {
                        count--;
                    }
                    map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
                }
                if (i - end + 1 < min) {
                    min = i - end + 1;
                    result = s.substring(end, i + 1);
                }
                end++;
            }
        }
        return result;

    }

    //it doesn't allow duplicates
    public static String minWindows(String s, String p) {
        int end = 0;
        int min = Integer.MAX_VALUE;
        String result = "";
        HashSet<Character>set = new HashSet<>();
        for(int i = 0; i < p.length(); i++){
            set.add(p.charAt(i));
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                int c = map.containsKey(ch) ? map.get(ch) + 1 : 1;
                if (c == 1) {
                    count++;
                }
                map.put(ch, c);
            }

            while (set.size() == count) {
                if (set.contains(s.charAt(end))) {
                    if (map.get(s.charAt(end)) - 1 == 0) {
                        count--;
                    }
                    map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
                }
                if (i - end + 1 < min) {
                    min = i - end + 1;
                    result = s.substring(end, i + 1);
                }
                end++;
            }
        }
        return result;

    }
    
    public static void main(String[] args) {
        String s = "abbcbcba";
        String p = "abc";
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        //System.out.println(minWindow(s, set));
        System.out.println(minWindows(s, p));
    }
}
