/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September19th2018;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author nandini
 */
public class LongestUncommonSubSequence {
    public static int findLUSlength(String[] strs){
        if(strs == null || strs.length == 0){
            return -1;
        }
        //reverse sorting array with length
         Arrays.sort(strs, new Comparator<String>(){
        public int compare(String s1, String s2){ 
            return s2.length() - s1.length();
        }
        });
        
         for(int i = 0; i < strs.length; i++){
             int missMatchCount = strs.length - 1;
             for(int j = 0; j < strs.length; j++){
                 if(i != j && !isSubsequence(strs[i], strs[j])){
                     missMatchCount--;
                 }
             }
             // strs[i] is not a sub sequence of any other entry

             if(missMatchCount == 0){
                 return strs[i].length();
             }
         }
         return -1;
    
    }
        
    
    public static boolean isSubsequence(String s, String t){
        int j = 0;
        for(int i = 0; i < s.length() && j < t.length(); i++){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
        }
        return j == t.length();
    }
    
    public static void main(String[]args){
        String[] s = {"aba", "cdc", "eae"};
        System.out.println(findLUSlength(s));
    }
}
