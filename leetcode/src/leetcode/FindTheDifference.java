/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class FindTheDifference {
        public static char findTheDifference(String s, String t) {
            char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        for (int i = 0; i < sa.length - 1; i++) {
            if (ta[i] != sa[i]) {
                return ta[i];
            }
        }

        return ta[ta.length-1];
    }
        
        public static void main(String[]args) {
            System.out.println(findTheDifference("abcd","abcde"));
        }

}
