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
public class LowerCase {
    public static String toLowerCase(String str){
        char [] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(str.charAt(i) + 32);
            }
        }
        return new String(ch);
    }
    public static void main(String[]args){
        String s = "LovE";
        System.out.println(toLowerCase(s));
    }
}
