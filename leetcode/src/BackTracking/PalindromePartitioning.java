/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        
        List<String> sub = new ArrayList<String>();
        List<List<String>> list = new ArrayList<List<String>>();
        if (s == null || s.length() == 0) {
            return list;
        }
        dfs(sub, list, s, 0);
        return list;

    } 
    public static void dfs(List<String>sublist, List<List<String>>result, String s, int start){
        if(start == s.length()){
            result.add(new ArrayList<String>(sublist));

        }
        for(int i = start; i < s.length(); i++){
            if(isPalindrome(s, start, i)){
                sublist.add(s.substring(start, i + 1));
                dfs(sublist, result, s, i + 1);
                sublist.remove(sublist.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                start++;
            }
                end--;
                return false;
            
        }
        return true;
    }
    public static void main (String[]args){
        System.out.println(partition("aab"));
    }
}
