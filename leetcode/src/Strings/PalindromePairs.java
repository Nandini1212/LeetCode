/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */

//O(n^2)
public class PalindromePairs {
    //time limit exceed
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>>result = new ArrayList<List<Integer>>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j && isPalindrome(words[i] + words[j])){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    result.add(temp);
                    
                }
            }
        }
        return result;
    }
    
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        if(s == null || s.length() < 2){
            return true;
        }
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String [] words = {"abcd","dcba","lls","s","sssll"};
        System.out.println(palindromePairs(words));
    }
    
}
