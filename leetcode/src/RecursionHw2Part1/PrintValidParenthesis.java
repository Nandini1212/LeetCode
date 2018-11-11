/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionHw2Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 1)X:If a string has more closing parentheses than opening ones, adding more parentheses to the right won't make it a well-formed combination.

2)All well-formed combinations have equal number of opening and closing parentheses. Hence, each type can be found exactly n times

3)If the number of closing ones is less than the number of the opening ones, then we can always make a consequence well-formed, by adding more closing parentheses.


 */
public class PrintValidParenthesis {
    public static void validParenthesis(String str, int open, int close){
        if(open == 0 && close == 0){
            System.out.println(str);
        }
        if(open > close){
            return;
        }
        if(open > 0){
            validParenthesis(str + "(",open - 1, close);
        } 
        if(close > 0){
            validParenthesis(str + ")", open, close - 1);
        }
    }
        static String[] find_all_well_formed_brackets(int n) {
            List<String>list = new ArrayList<String>();
            validParenthesis("", n, n);
            String[] myArray = list.toArray(new String[list.size()]);
            return myArray;
  
        }
        public static void main(String[]args){
            int num = 2;
            System.out.println(Arrays.toString(find_all_well_formed_brackets(num)));
            
        }

}
