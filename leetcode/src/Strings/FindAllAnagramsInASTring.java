/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 * O(N) time - loop, O(N) space - map
 */
public class FindAllAnagramsInASTring {
    public static List<Integer> findAnagrams(String s, String p) {
        int start = 0;
        int end = 0;
        int count = p.length();
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, 0);
            System.out.println(map.put(c, 0));
        }
        for(char c : p.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);           

                
            } else {
                return list;
            }
        }
        if(s == null || p == null || s.length() < p.length()){
            return list;
        }
        while(end < s.length()){
            if(map.get(s.charAt(end)) > 0){
                count--;
            }
            map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
            System.out.println( "1st while : "+ map.put(s.charAt(end), map.get(s.charAt(end))));
            while(count == 0){
                if(end - start + 1 == p.length()){
                    list.add(start);
                }
                map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                
                if(map.get(s.charAt(start)) > 0){
                    count++;
                }
                start++;
            }
            end++;
        }
        return list; 
        
    }
    public static void main(String[]args){
        String s= "ababd";
        String p = "ab";
        
        System.out.println(findAnagrams(s, p));
    }

}
