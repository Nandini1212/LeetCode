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
public class NumberOfSegments {
    public static int countSegments(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                if((i == 0)|| (s.charAt(i - 1) == ' ')){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
}
