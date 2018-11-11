/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;

/**
 *
 * @author nandini
 */
public class ReverseVowelsOfAString {
    
    public static String reverseVowels(String s) {
       ArrayList<Character> vowel = new ArrayList<Character>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
       char [] arr = s.toCharArray();
       int index = 0, len = arr.length - 1;
       while(index < len) {
           if(!vowel.contains(arr[index])) {
               index++;
               continue;
           }
           if(!vowel.contains(arr[len])) {
               len--;
               continue;
           }
           char temp = arr[index];
           arr[index] = arr[len];
           arr[len] = temp;
           index++;
           len--;
       }
       return new String(arr);
       
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
