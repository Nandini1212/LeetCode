/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nandini
 */
public class ImplementStackUsingQueues {
    private Queue<Integer> queue;
    /** Initialize your data structure here. */
    public void MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
         for(int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.peek());
            queue.poll();
        }
    }
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
