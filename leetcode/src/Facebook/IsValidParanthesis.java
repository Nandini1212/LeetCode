/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.Stack;

/**
 *
 * @author nandini
 */
public class IsValidParanthesis {
    public static boolean isValid(String s){
        char arr[] = s.toCharArray();
        Stack<Character> set = new Stack();
	for (Character ch : arr) {
            if (ch == '{' || ch == '[' || ch == '(') {
		set.push(ch);
		} else if (ch == ']') {
		    if (set.isEmpty() || set.peek() != '[') {
                        return false;
                    } 
            	set.pop();
		} else if (ch == ')') {
                    if (set.isEmpty() ||  set.peek() != '('){
			return false;
                    }       
                    set.pop();	
		} else if (ch == '}') {
		       if (set.isEmpty() ||  set.peek() != '{'){ 
                            return false;
                       }
                        set.pop();	
		}
	}
	return set.size() == 0;

    }
    public static void main(String[]args){
        String s = "}{";
        System.out.println(isValid(s));
    }
    
}
