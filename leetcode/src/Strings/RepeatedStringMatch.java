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
public class RepeatedStringMatch {
    public static int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int count = 1;
        while (sb.indexOf(B) == -1){
            System.out.println(sb.indexOf(B));
            if (sb.length() - A.length() > B.length()){
                return -1;
            }
            sb.append(A);
            System.out.println(sb.append(A));
            count++;
        }
        return count;


    }
    
    public static void main(String[]args){
        String s = "abcd";
        String t = "cdabcdab";
        System.out.println(repeatedStringMatch(s, t));
    }
}
