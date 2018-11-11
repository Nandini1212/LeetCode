/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewkickstart;

/**
 *
 * @author nandini
 */
public class PatternMatch {
    public static boolean patternMatch(String str, String pattern) {
            
        return false;
    }
    public static boolean match(String s, String p, int sIndex, int pIndex) {
            int sLength = s.length();
            int pLength = p.length();
            if(sIndex == sLength && pIndex == pLength) {
                return true;
            } 
            if(pIndex == pLength){
                return false;
            } 
            if(sIndex == sLength) {
            return false;
            }
            if(p.charAt(pIndex) != '*') {
                return false;
            }
            if(p.charAt(pIndex) == '.' || p.charAt(pIndex) == s.charAt(sIndex)){
                return match(s,p,sIndex + 1,pIndex + 1);
            }
            if(p.charAt(pIndex) != '.' && p.charAt(pIndex) != '*' &&  p.charAt(pIndex) != s.charAt(sIndex)){
                return false;
            }
            if(p.charAt(pIndex) == '*') {
                return match(s,p,sIndex + 1, pIndex);
            }
            return false;
        
    }
    
    //option 1 : a matches * then sIndex becomes sIndex + 1 but pIndex will be the same.
    //option 2 : a doesnt match, sIndex will be remain same, but pIndex is pIndex + 1. a remains there. 
    
    public static void main(String [] args){
        
    }
    
}
