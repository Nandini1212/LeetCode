/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author nandini
 * time : O(n)
 * space : O(1)
 */
public class IsOneEditDistance {
    public static boolean isOneEditDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(Math.abs(m - n) > 1){
            return false;
        }
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else {
                if(count == 1){
                    return false;
                }
                if(m > n){
                    i++;
                }else if(m < n){
                    j++;
                } else {
                    //if both are same lengths;
                    i++;
                    j++;
                }
                count++;
            }
        }
        if(i < m || j < n){
            count++;
        }
        return count == 1;
    }
    public static void main(String[]args){
        String s = "a";
        String t = "";
        System.out.println(isOneEditDistance(s,t));
    }
}
