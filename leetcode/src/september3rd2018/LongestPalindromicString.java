/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

/**
 *
 * @author nandini
 * 
 * http://flexaired.blogspot.com/2011/03/longest-palindrome-in-string.html - have to take a lok
 * 
 * first and the last character are the same
the inner word between the first and the last character is a palindromic 
* string
*  Time and Space complexity : O(n^2)
 */
public class LongestPalindromicString {
    public static String longestPalindrome(String s){
        //edge case check, if it is only one character
        if(s == null || s.length() <= 2){
            return s;
        }
        //start index and ending index
        int right = 0;
        int left = 0;
        //dynamic programming technique
        boolean [][] dp = new boolean [s.length()][s.length()];
        
        for(int j = 1; j < s.length(); j++){
            for(int i = 0; i < j; i++){
                //if both values are equal and i + 1 and j - 1 is true and one
                //single character
                if((s.charAt(i) == s.charAt(j)) && (dp[i + 1][j - 1] 
                        || j - i <= 2)){
                    dp[i][j] = true;
                    if(j - i > right - left){
                       right = j;
                       left = i;
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }
    public static void main(String[] args){
        String s = "abcbaabcaaaa";
        System.out.println(longestPalindrome(s));
    }
}
