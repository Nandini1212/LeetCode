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
public class PermutationInString {
    public static boolean checkInclusion(String s, String p) {
        
        if(s == null || p == null){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int count = map.size();
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        while(end < p.length()){
            char ch = p.charAt(end);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) {
                    count--;
                }
            }

            while(count == 0){
                if(end - start + 1 == s.length()){
                    return true;
                }
                char temp = p.charAt(start);
                if(map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if(map.get(temp) > 0) {
                        count++;
                    }
                }
                start++;
            }
            end++;
        }
        return false; 
        
        
    }
    public static void main(String[]args){
        String s= "ab";
        String p = "eidboaoo";
        
        System.out.println(checkInclusion(s, p));
    }
    
}
