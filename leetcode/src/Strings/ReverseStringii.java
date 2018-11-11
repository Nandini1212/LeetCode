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
public class ReverseStringii {
    public static String reverseStr(String s, int k){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            int start = i;
            int end = i + k - 1;
            if (end > s.length()-1){
                end = s.length() - 1;
            }
            while (start < end) {
                char temp = chars[end];
                chars[end] = chars[start];
                chars[start] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
    public static void main(String[]args){
        String s = "abcdefg";
        System.out.println(reverseStr(s, 2));
    }
}
