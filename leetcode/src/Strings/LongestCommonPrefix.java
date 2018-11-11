/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author nandini
 * To find the longest common prefix string amongst an array of strings, 
 * we can declare a variable “longestCommonPrefix”.
 * In the beginning, it initializes with the value of the first string of the input array.
 * Then compare the “longestCommonPrefix” with all strings in the array to get the longest
 * common prefix for all the strings.


 */
public class LongestCommonPrefix {
    public static String longestCommonPrefixs(String [] s){
        if(s.length == 0 || s == null){
            return "";
        }
        String longestCommonPrefix = s[0];
        for(int i = 1; i < s.length; i++){
            int j = 0;
            String currentString = s[i];
            while(j < longestCommonPrefix.length()
                    && j < currentString.length() 
                    && (longestCommonPrefix.charAt(j)) == currentString.charAt(j)){
                j++;
            }
            if(j == 0){ // no common prefix
                return "";
            }
            longestCommonPrefix = longestCommonPrefix.substring(0, j); // if j has some value
        }
    return longestCommonPrefix;
    }
    public static void main(String[]args){
        String [] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefixs(arr));
                
    }
    
}
