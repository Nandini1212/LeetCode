/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionHw2Part1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class PalindromicDecompositionString {

  static boolean isPalindrome(String input){
    int i = 0;
    int j = input.length() - 1;
    while(i <= j){
      if(input.charAt(i) != input.charAt(j)){
        return false;
      }
      else{
        i++;
        j--;
      }
    }
    return true;
  }

  static void palindromicDecompositions(String input, int position, String current, List<String> all){
    if(position == input.length()){
      int len = current.length();
      //System.out.println("Acc length is : " + len);
      String res = current.substring(0, len - 1);
      //System.out.println("Acc is : " + res);
      all.add(res);
      return;
    }
    for(int i = position; i < input.length(); i++){
       //System.out.println("position is : " + position);
      String maybePalindrome = input.substring(position, i + 1);
       //System.out.println("substring is : " + input.substring(position, i + 1));
       //System.out.println("may be palindrome is : " + maybePalindrome);
      
      if(isPalindrome(maybePalindrome)){
        String separation = maybePalindrome + "|";
        palindromicDecompositions(input, i + 1, current + separation, all);

      }
    }
    return;
  }

  static String[] generate_palindromic_decompositions(String s) {
      List<String> list = new ArrayList<>();
    palindromicDecompositions(s, 0, "", list);
    String [] result = new String[list.size()];
      for(int i = 0; i < result.length; i++){
        result[i] = list.get(i);
      }
      return result;
    }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    palindromicDecompositions("abab", 0, "", list);
    System.out.println(list);
  }
}

