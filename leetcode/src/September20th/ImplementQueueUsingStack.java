/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

import java.util.Stack;

/**
 *
 * @author nandini
 */
public class ImplementQueueUsingStack {
    Stack<Integer>s1 = new Stack<>();
    Stack<Integer>s2 = new Stack<>(); 
    public void MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
         s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int val = peek();
        s2.pop();
        return val;
    }
    
    /** Get the front element. */
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.size() + s2.size() == 0;
    }

}
