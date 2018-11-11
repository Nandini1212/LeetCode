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
public class BackSpaceStringCompare {
    
    public static boolean backspaceCompare(String S, String T) {
    if (S.isEmpty() && T.isEmpty()) {
            return true;
        }
        if (S == null && T == null) {
            return true;
        }
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        char[] sChars = S.toCharArray();
        char[] tChars = T.toCharArray();

        push(sStack, sChars);
        push(tStack, tChars);
        if (sStack.size() != tStack.size()) {
            return false;
        } else {
            while (!sStack.isEmpty() && !tStack.isEmpty()) {
                if (!sStack.pop().equals(tStack.pop())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void push(Stack<Character> stack, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
            if (chars[i] == '#') {
                stack.pop();
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }
}
