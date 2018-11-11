/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class RegularExpressionTrie {
    boolean regex(String s, String p, int sptr, int pptr){    
    if(sptr==s.length() && pptr==p.length())            
    return true; 
    else if(sptr>=s.length() || pptr>=p.length()) 
    return false; 
    else {  
    if (s.charAt(sptr) == p.charAt(pptr)) 
    return regex(s, p, ++sptr, ++pptr);  
    else if (p.charAt(pptr) == '*') {   
    return regex(s, p, sptr, pptr + 1) || regex(s, p, sptr + 1, pptr);   
            }            
            else                
            return false;        
            }  
    } 
}
