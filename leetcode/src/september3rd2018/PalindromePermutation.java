/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

import java.util.HashMap;

/**
 *
 * @author nandini
 * take the count of each character,
 * if the character count is even, it is a palindrome and if it is
 * odd not a palindrome permutation
 */
public class PalindromePermutation {
    public static boolean canPermutePalindrome(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < s.length(); i++){
            String str = s.charAt(i) + "";
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        int count = 0;
        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String s = "code";
        System.out.println(canPermutePalindrome(s));
    }
}
