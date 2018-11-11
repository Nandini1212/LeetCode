/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September4th2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class LetterCombinationOfAPhoneNumber {
    public static List<String> letterCombination(String digits){
        List<String>result = new ArrayList<String>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('0',new char[]{});
        map.put('1',new char[]{});
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});
        
        StringBuilder sb = new StringBuilder();
        letterCombinationHelper(digits, sb, map, result);
        return result;
    }
    public static void letterCombinationHelper(String digits, StringBuilder sb, 
            HashMap<Character, char[]> map, List<String> list){
        
        if(sb.length() == digits.length()){
            list.add(sb.toString());
            return;
        }
        for(char ch : map.get(digits.charAt(sb.length()))){
            sb.append(ch);
            letterCombinationHelper(digits, sb, map, list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public static void main(String []args){
        System.out.println(letterCombination("23"));
    }
}
