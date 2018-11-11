/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.HashSet;

/**
 *
 * @author nandini
 * 
 * We use two pointers technique to solve the problem. 
 * One slow pointer i, one fast pointer j.

We also add a HashSet to store the characters which have been visited by i pointer
* to help detect repeating characters.

We keep moving i pointer right further.

If current s.charAt(i) character is not in the HashSet, we add the character to the
* HashSet and keep moving i further.
If current s.charAt(i) character is in the HashSet, we remove the character j 
* is visiting and move j forward. At this point, we found the maximum size of 
* substrings without duplicate characters start with index j.
* We move j pointer one step further.
When i pointer iterates all the characters of the string,
* we get the max length of the longest substring without repeating characters.
 */
public class lengthOfLongestSubStringWithoutRepeatingChar {
    /*
    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 0 ||s == null){
            return 0;
        }
        int k = 0;
        int result = 0;
        HashSet<Character>set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                result = Math.max(result, set.size());
            } else {
                while(k < i){
                    if(s.charAt(k) == c){
                        k++;
                        break;
                    } else {
                        set.remove(s.charAt(k));
                        k++;
                    }
                }
            }
        }
        return result;
    }*/
    
    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 0 ||s == null){
            return 0;
        }
        int i = 0;
        int j = 0;
        int result = 0;
        HashSet<Character>set = new HashSet<Character>();
        while(i < s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
                result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return result;
    }
    public static void main(String[]args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
