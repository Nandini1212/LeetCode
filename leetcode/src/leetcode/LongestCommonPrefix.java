/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author nandini
 */
public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {
            for(int index = 0; index <= strs[0].length() - 1; ++index){
                for(int innerIndex = 1; innerIndex <= strs.length - 1; ++innerIndex) {
                    if(index == strs[innerIndex].length() || strs[0].charAt(index) != strs[innerIndex].charAt(index)) {
                        return strs[0].substring(0, innerIndex);
                    }
                }
            }
            return strs[0];
        }
        public static void main(String[] args) {
            String [] arr = {"flower","flow","flight","flat", "fllat"};
            System.out.println(longestCommonPrefix(arr));
            
        }
    
}
