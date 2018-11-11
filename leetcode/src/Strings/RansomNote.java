/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 Its principle is to list the alphabet of the magazine, 
 * then calculate the number of occurrences, 
 * and then traverse ransomNote to ensure that enough letters are available 
 * and the code is very clear.

 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if ("".equals(ransomNote)) {
            return true;
        }

        if ("".equals(magazine)) {
            return false;
        }
        int[]arr = new int[26];
        //int pos = 0;
        for(int i = 0; i < magazine.length(); i++){
            int pos = magazine.charAt(i) - 'a';
            arr[pos] += 1;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            int pos = ransomNote.charAt(i) - 'a';
            arr[pos] -= 1;
            if(arr[pos] < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String a = "aa";
        String b = "aab";
        System.out.println(canConstruct(a, b));
    }
    
}
