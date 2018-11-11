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
public class RepeatedSubStringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int count = 0;
        for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
       String s = "abab";
       System.out.println(repeatedSubstringPattern(s));
    }
    
}
