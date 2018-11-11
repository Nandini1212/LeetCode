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
public class ReverseString {
    public static String reverseString(String s) {
        
        char[] ch = s.toCharArray();
        int start = 0;
        char temp;
        int end = ch.length - 1;
        while(start <= end) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            end -= 1;
            start += 1;
        }
        return new String(ch);
    }

    

    /*
    public static String reverseString(String S) {
        char[] ch = S.toCharArray();
        String result ="";
        int len = S.length();
        for(int index = len - 1; index >=  0; index--) {
            result += S.charAt(index);
        }
        return result;
    }*/
    public static void main(String [] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
    
}
