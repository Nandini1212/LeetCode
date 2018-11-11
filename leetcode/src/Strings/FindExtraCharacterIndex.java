/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class FindExtraCharacterIndex {
    public static String ExtraCharacter(String a, String b){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < b.length(); i++){
            map.put(b.charAt(i), 1);
        }
        for(int i = 0; i < a.length(); i++){
            if(map.containsKey(a.charAt(i))){
                map.put(a.charAt(i), map.get(a.charAt(i)) - 1);
            }
        }
        char ch = '\0';
        
        for (HashMap.Entry<Character, Integer> t : map.entrySet()) {
       
            ch = t.getKey();
            
        }
        String s = Character.toString(ch);
        return s;
    }
    static char findExtraCharcter(String strA, 
                                  String strB) 
    { 
        // result store the result 
        int res = 0, i; 
      
        // traverse string A till  
        // end and xor with res 
        for (i = 0; i < strA.length(); i++) 
        { 
            // xor with res 
            res ^= strA.charAt(i); 
        } 
      
        // traverse string B till end and  
        // xor with res 
        for (i = 0; i < strB.length(); i++) 
        { 
            // xor with res 
            res ^= strB.charAt(i); 
        } 
      
        // print result at the end 
        return ((char)(res)); 
    } 
    
    public static void main(String[]args){
        String a = "abcd";
        String b= "aebcd";
        System.out.println(ExtraCharacter(a, b));
    }
}
