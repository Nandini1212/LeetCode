/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickstartStrings;

/**
 the second char of pattern is "*"
the second char of pattern is not "*"
For the 1st case, if the first char of pattern is not ".", 
* the first char of pattern and string should be the same. Then continue to match the remaining part.

For the 2nd case, if the first char of pattern is "." 
* or first char of pattern == the first i char of string, continue to match the remaining part.
* Time complexity O(N), Space O(1)


 */
public class RegularExpressionMatching {
    public static boolean isMatch(String string, String pattern){
        if(string.length() == 0 && pattern.length() == 0){
            return true;
        }
        if(pattern.length() == 0){
            return string.length() == 0;
        }
        if(pattern.length() == 1){
            if(string.length() < 1){
                return false;
            } else if((pattern.charAt(0) != string.charAt(0)) && (pattern.charAt(0) != '.')){
                return false;
               //compare the rest of the string 
            } else {
                return isMatch(string.substring(1), pattern.substring(1));
            }
            
        }
        //case 1 : second char of pattern is not '*'
        if(pattern.charAt(1) != '*'){
            if(string.length() < 1){
                return false;
            }
            if((pattern.charAt(0) != string.charAt(0)) && pattern.charAt(0) != '.'){
                return false;
            } else {
                return isMatch(string.substring(1), pattern.substring(1));
            }
        }
        //case 2 : second char is a '*'
        else {
            //a char and '*' can stand for 0 element
            if(isMatch(string, pattern.substring(2))){
                return true;
            }
            // a char and '*' can stand for 1 or more elements. i.e., try for
            //all substrings
            int i = 0;
            while(i < string.length() && (string.charAt(i) == pattern.charAt(0)) || pattern.charAt(0) == '.'){
                if(isMatch(string.substring(i + 1), pattern.substring(2))){
                    return true;
                }
                i++;
            }
                    
        }
        return false;
    }
    public static void main(String[] args){
        String s = "aab";
        String pattern = "c*a*b";
        System.out.println(isMatch(s, pattern));
    }
}
