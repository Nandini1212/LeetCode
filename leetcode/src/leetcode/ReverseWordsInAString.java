/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class ReverseWordsInAString {
    /*
        public static String reverseWords(String s) {
            //split to words by space
            String [] splitS = s.split(" ");
            String finalString = " ";
            for (int index = splitS.length - 1; index >= 0; index--) {
                finalString += splitS[index] + " ";
            }
            return finalString;
            
        }*/
    
    public static String reverseWords(String s) {
        String [] splitWords = s.split(" ");
        String reverse = "";
        for(int index = 0; index < splitWords.length; index++) {
            String word = splitWords[index];
            String reverseWord = "";
            for (int innerindex = word.length() - 1; innerindex >= 0; innerindex--) {
                reverseWord += word.charAt(innerindex);
            }
            reverse = reverse + reverseWord + " ";
        }
        //remove space at the end of the string
        return reverse.trim();
    }
        public static void main(String [] args) {
            String str = "this is a boy";
            System.out.println(str);
            System.out.println(reverseWords(str));
        }

    
}
