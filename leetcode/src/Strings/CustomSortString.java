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
public class CustomSortString {
    public static String customSortString(String S, String T) {
        int [] arr = new int [26];
        //count T characters
        for(char ch: T.toCharArray()){
            arr[ch-'a']++;
        }
        // append S  chars at the right order as many times as they appear in T
        StringBuilder sb = new StringBuilder();
        for(char ch: S.toCharArray()){
            while(arr[ch-'a']>0){
                sb.append(ch);
                System.out.println(ch);
                arr[ch-'a']--;
            }
        }
        //append the rest of the T characters
        for(int i = 0; i<arr.length; i++){
            while(arr[i]>0){
                System.out.println(arr[i]);
                sb.append((char)(i+'a'));
                arr[i]--;
            }
        }
        
        return sb.toString();
    }
    
    
    public static String customSortStrings(String s,String t){
        int[] arr = new int[26];
        for(char ch : t.toCharArray()){
            arr[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            while(arr[ch - 'a'] > 0){
                sb.append(ch);
                arr[ch - 'a']--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            while(arr[i] > 0){
                sb.append((char)(i + 'a'));
                arr[i]--;
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        String s = "cba";
        String t = "abcd";
        System.out.println(customSortStrings(s,t));
    }
}
