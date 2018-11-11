/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickstartStrings;

import java.util.Arrays;

/**
 *
 * @author nandini
 * Time complexity: O(nlogn), Space complexity: O(n)
 */
public class LongestRepeatedSubstring {
    public static String lrs(String s) {  
    // form the N suffixes  
    int N  = s.length();  
    String[] suffixes = new String[N];  
    for (int i = 0; i < N; i++) {  
        suffixes[i] = s.substring(i, N);  
    }  
    // sort them  
    Arrays.sort(suffixes);  
  
    // find longest repeated substring by comparing adjacent sorted suffixes  
    String lrs = "";  
    for (int i = 0; i < N - 1; i++) {  
        String x = lcp(suffixes[i], suffixes[i+1]);  
        if (x.length() > lrs.length())  
            lrs = x;  
    }  
    return lrs;  
}  
  
// return the longest common prefix of s and t  
public static String lcp(String s, String t) {  
    int n = Math.min(s.length(), t.length());  
    for (int i = 0; i < n; i++) {  
        if (s.charAt(i) != t.charAt(i))  
            return s.substring(0, i);  
    }  
    return s.substring(0, n);  
}  
public static void main(String[]args){
    String s = "banana";
    System.out.println(lrs(s));
}
}
