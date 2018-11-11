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
public class LetterCasePermutation {
    public static List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<String>();
        list.add(s);
        if(s.length() == 0 || s == null){
            return list;
        }
        char [] arr = s.toCharArray();
        getPermutation(arr, 0, list);
        return list;
    }
    public static void getPermutation(char[]arr, int index, List<String> list){
        if(index == arr.length){
            return;
        }
        getPermutation(arr, index + 1, list);
        
        char c = arr[index];
        if(Character.isLowerCase(c)){
            arr[index] = Character.toUpperCase(c);
            list.add(new String(arr));
            getPermutation(arr, index + 1, list);
        }
        if(Character.isUpperCase(c)){
            arr[index] = Character.toLowerCase(c);
            list.add(new String(arr));
            getPermutation(arr, index + 1, list);
        }
    }
    public static void main(String[]args){
        String s = "1234";
        System.out.println(letterCasePermutation(s));
    }
}
