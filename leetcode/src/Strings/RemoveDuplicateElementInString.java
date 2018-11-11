/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author nandini
 */
public class RemoveDuplicateElementInString {
//not lexicographical 
    public static String removeString(String someStr) {
        StringBuilder uniqueStr = new StringBuilder();
        if (someStr != null) {
            for (int i = 0; i < someStr.length(); i++) {
                if (uniqueStr.indexOf(String.valueOf(someStr.charAt(i))) == -1) {
                    uniqueStr.append(someStr.charAt(i));

                }
            }
        }

        return uniqueStr.toString();
        
    }
    
    public String removeDuplicateLetters(String s) {
 
  int[] count = new int[26];
  boolean[] used = new boolean[26];
  Stack<Character> stack = new Stack<Character>();
  
  for (char letter : s.toCharArray())
    count[letter - 'a']++;
 
  for (char letter : s.toCharArray()) {
    count[letter - 'a']--;
    if (used[letter - 'a'])
      continue;
    while (!stack.isEmpty() && stack.peek() > letter && count[stack.peek() - 'a'] > 0)
      used[stack.pop() - 'a'] = false;
 
    stack.push(letter);
    used[letter - 'a'] = true;
  }
 
  String finalstr = "";
  while (!stack.isEmpty()) {
      finalstr = stack.pop() + finalstr;
  }
 
  return finalstr;
}
    //Time: O(n), space: O(k) : k represents the number of unique characters in the original string


    public static String removeDuplicateLetter(String s) {
        int [] count = new int [26];
        boolean [] visited = new boolean[26];
        Stack<Character>stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']--;
            if(visited[s.charAt(i) - 'a']){
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > s.charAt(i) 
                    && count[stack.peek() - 'a'] > 0){
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(s.charAt(i));
            visited[stack.peek() - 'a'] = true;
        }
        String result = "";
        while(!stack.isEmpty()){
            result = stack.pop() + result;
        }
        return result;
    }
    

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetter(s));
    }
}
