/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.HashMap;

/**
 *
 * @author nandini
 * take a hash map where we get the unique characters.
 * and take the start pointer to maintain the window size
 * In this solution, a hashmap is used to track the unique elements in the map. 
 * When a third character is added to the map, 
 * the left pointer needs to move right.
 * 
 * if we want to do atmost 2 characters in base case should do s.length() == 0
 * 
 */
public class LongestSubStringThatContain2UniqueChars {
    public static int lengthOfLongestSubstringTwoDistinct(String s){
         int max=0;
    HashMap<Character,Integer> map = new HashMap<Character, Integer>();
    int start=0;
    if(s.length() == 1){
        return 0;
    }
 
    for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);
        if(map.containsKey(c)){
            map.put(c, map.get(c)+1);
            //System.out.println(map.get(c));
            if(map.get(c)  == s.length()){
             return max = 0;   
            }
        }else{
            map.put(c,1);
        }
 
        if(map.size()>2){
            max = Math.max(max, i-start); 
            while(map.size()>2){
                char t = s.charAt(start);
                int count = map.get(t);
                
                //counter > 1 means that
            // there are more than two distinct characters in the current window.
            // So we should move the sliding window.
                if(count>1){
                    map.put(t, count-1);
                }else{
                    map.remove(t);
                }
                start++;
            }
        }
    }
 
    max = Math.max(max, s.length()-start);
 
    return max;
    }
    public static void main(String[]args){
        String s = "ababbcccccc";
        System.out.println(lengthOfLongestSubstringTwoDistinct(s));
    }
}
