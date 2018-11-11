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
public class BuddyStrings {
    public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()){
            return false;
        }
    int[] ca = new int[26];
    int[] cb = new int[26];
    int diff = 0;
    for (int i = 0; i < A.length(); i++) {
        ca[A.charAt(i) - 'a']++;
        cb[B.charAt(i) - 'a']++;
        if (A.charAt(i) != B.charAt(i)){
            diff++;
            
        }
    }
    for (int i = 0; i < ca.length; i++) {
        if (diff == 0 && ca[i] > 1){
            return true;
        }
        if (ca[i] != cb[i]){
            return false;
        }
    }
    return diff == 2;
    }
    public static void main(String[]args){
        String a = "ab";
        String b = "ba";
        System.out.println(buddyStrings(a,b));
    }
}
