/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macysPrep;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author nandini
 */
public class romanToInteger {
    /*
    public static int romanToInteger(String num) {
        Hashtable<Character, Integer> romanTable = new Hashtable<Character, Integer>();
        romanTable.put('i', 1);
        romanTable.put('x', 10);
        romanTable.put('c', 100);
        romanTable.put('m', 1000);
        romanTable.put('v', 5);
        romanTable.put('l', 50);
        romanTable.put('d', 500);
        
        int integerNum = 0;
        int prev = 0;
        
        for(int index = num.length() - 1; index >= 0; index--) {
            int temp = romanTable.get(num.charAt(index));
            if(temp < prev) {
                integerNum -= temp;
            } else {
                integerNum += temp;
            }
            prev = temp;
            
        }
         return integerNum;       
    }*/
    
    public static int romanToInteger(String s) {
        if (s == null) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int len = s.length();
        int num = 0;
        for (int i = len - 1; i >= 0; i--) {
            int cur = map.get(s.charAt(i));
            if (i < len - 1 && cur < map.get(s.charAt(i + 1))) {
                num -= cur;
            } else {
                num += cur;
            }
        }
        return num;
    }
    
    public static void main(String [] args) {
        String roman = "IXCM";
        System.out.println(romanToInteger(roman));
    }
    
}
