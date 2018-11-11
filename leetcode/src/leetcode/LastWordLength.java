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
public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String a = s.trim();
        int count = 0;
        for(int index = 0; index < a.length(); index++) {
            if(a.charAt(index) == ' ') {
                count = 0;
            } else {
                count++;
            }
            
        }
        return count;
    }
    public static void main(String [] args) {
        String last = "the man is boysureshtutti";
        System.out.println("length is: " + lengthOfLastWord(last));
    }
}
