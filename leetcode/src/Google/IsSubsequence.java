/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

/**
 *
 * @author nandini
 * Time Complexity of both implementations above is O(n) where n is the length of str2.
 * The idea is simple, we traverse both strings from one side to other side (say from rightmost character to leftmost).
 * If we find a matching character, we move ahead in both strings. Otherwise we move ahead only in str2.
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t){
        int j = 0;
         for(int i = 0; i < t.length() && j < s.length(); i++){
             if(s.charAt(j) == t.charAt(i)){
                 j++;
             }
         }
         return (j == s.length());
    }
    public static void main(String[] args){
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    
}
