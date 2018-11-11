/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author nandini
 */
public class RemoveInvalidParenthesisForSingle {

    public static String removeInvalidParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
      
        for (int i = 0; i < s.length(); i++) {
            
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')') {
                    if(!stack.isEmpty()){
                    sb.append(stack.pop()).append(s.charAt(i));
                    } else {
                        System.out.println("empty");
                        sb.append("");
                    }
                } 
            
            
        }
        /*
        while(!stack.isEmpty()) {
            sb.append("");
        }*/
        /*
        String m = sb.toString();
        if(isValid(m)){
            return m;
        }
        System.out.println("not valid");
return "0";*/
        return sb.toString();
    }

    public static boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }
        return (count == 0);
    }

    public static void main(String[] args) {
        String s = "()()(()";
        String t = "((((((";
        String m = ")(";
        
        //System.out.println("s is :" + removeInvalidParentheses(s));
        System.out.println("t is  :" + removeInvalidParentheses(t));
        //System.out.println("m is :" + removeInvalidParentheses(m));

    }
}
