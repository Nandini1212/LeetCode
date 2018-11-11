/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

import java.util.Stack;

/**
 *
 * @author nandini
 */
public class MinStack {
    Stack<Integer>stack1;
        Stack<Integer>stack2;
    public MinStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x){
        stack1.push(x);
        if(stack2.isEmpty()){
            stack2.push(x);
        } else {
            stack2.push(Math.min(stack2.peek(), x));
        }
    }
    public void pop(){
        stack1.pop();
        stack2.pop();
    }
    public int top(){
        return stack1.peek();
    }
    public int getMin(){
        return stack2.peek();
    }
}
