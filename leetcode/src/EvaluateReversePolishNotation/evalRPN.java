/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvaluateReversePolishNotation;

import java.util.Stack;

/**
 *
 * @author nandini
 */
public class evalRPN {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int len = tokens.length;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (tokens[i].equals("+")) {
                temp = stack.pop() + stack.pop();
                stack.push(temp);
            } else if (tokens[i].equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                temp = b - a;
                stack.push(temp);
            } else if (tokens[i].equals("*")) {
                temp = stack.pop() * stack.pop();
                stack.push(temp);
            } else if (tokens[i].equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                temp = b / a;
                stack.push(temp);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"0", "3", "/"};
        System.out.println(evalRPN(tokens));
    }
}
