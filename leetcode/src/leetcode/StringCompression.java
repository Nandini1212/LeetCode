/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *Time Complexity: O(N) 
 * Space Complexity: O(1)
 * @author nandini
 */
public class StringCompression {
    public static int compress(char[] chars) {
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            int end = i;
            while (end < chars.length && chars[end] == chars[i]) {
                end++;
            }
            if (end == i + 1) {
                chars[start++] = chars[i];
            } else {
                chars[start++] = chars[i];
                char[] count = String.valueOf(end - i).toCharArray();
                for (int l = 0; l < count.length; l++) {
                    chars[start++] = count[l];
                }
            }
            i = end - 1;
        }
        return start;

    }
    public static void main(String [] args) {
        char [] ch = {'a','a','b','b','c','c','c'};
        System.out.println(compress(ch));
        
    }
    
}
