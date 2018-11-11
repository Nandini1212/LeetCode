/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author nandini
 */
public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        int j = 0;
        int i = 0;
        int count = 0;
        if (haystack == null || needle == null) { 
            return -1; 
        } 
        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;

            } else {
                i = i - j + 1;
                j = 0;
            }
            if(j == needle.length()){
                    System.out.println("i " + i + "j"+j);
                    return i - j;
            } 
            
        }
        return -1;
    }
    public static void main(String[]args){
        String s = "a";
        String t = "a";
        System.out.println(strStr(s,t));
    }
}
