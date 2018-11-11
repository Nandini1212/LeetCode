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
public class LongestUncommonSubsequencei {
    public static int findLongestSubsequence(String a, String b){
        if(a.length() != b.length()){
            return Math.max(a.length(), b.length());
        } else if(!a.equals(b)){
            return a.length();
        } else {
            return -1;
        }
    }
    public static void main(String[]args){
        String a = "aba";
        String b = "cbd";
        System.out.println(findLongestSubsequence(a,b));
    }
}
