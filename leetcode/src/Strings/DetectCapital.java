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
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if (word == null ){
            return false;
        }
        int len = word.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i))){
             count++;
            }
        }
        if (count == 1) {
            
            return Character.isUpperCase(word.charAt(0));
        }
        return count == 0 || count == len;
    }
    public static void main(String[]args){
        String s = "FlaG";
        System.out.println(detectCapitalUse(s));
    }
}
