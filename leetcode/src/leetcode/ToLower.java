/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author nandini
 */
public class ToLower {
    public static String toLowerCase(String str) {
        char [] toChar = str.toCharArray();
        for(int index = 0; index < str.length(); index++) {
            if(str.charAt(index) >= 'A' && str.charAt(index) <= 'z') {
                str = str + ('a' - 'A');               
            }
        }
        return str.toString();
        
    }
    public static void main(String [] args) {
        String str = "MON";
        String result = toLowerCase(str); 
        System.out.println(result);
    }
}

    
