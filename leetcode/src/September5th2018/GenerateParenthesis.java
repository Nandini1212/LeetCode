/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September5th2018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        validParenthesis(list, "",n, n);             
        return list;
    }
    public static void validParenthesis(ArrayList<String>list, String str, int open, int close){
        if(open == 0 && close == 0){
            list.add(str);
        }
        if(open > close){
            return;
        }
        if(open > 0){
            validParenthesis(list, str + "(",open - 1, close);
        } 
        if(close > 0){
            validParenthesis(list, str + ")", open, close - 1);
        }
    }
    public static void main(String[]args){
        
     System.out.println(generateParenthesis(3));   
    }
}
