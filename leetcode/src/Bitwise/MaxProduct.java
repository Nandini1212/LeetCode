/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitwise;

/**
 *
 * @author nandini
 */
public class MaxProduct {
    public static int maxProduct(String[]words){
        if(words == null || words.length == 0){
            return 0;
        }
        int [] value = new int [words.length];
        for(int i = 0; i < words.length; i++){
            String temp = words[i];
            value[i] = 0;
            for(int j = 0; j < temp.length(); j++){
                value[i] |= 1 << (temp.charAt(j) - 'a');
            }
        }
        int max = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if ((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > max)){
                    max = words[i].length() * words[j].length();
                }
            }
        }
        return max;
    }
    public static void main(String[]args){
        String[]words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(words));
    }
}
