/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author nandini
 */
public class PostOrderIterativeTraversal {
    public void postOrderTraversal(Node root){
        Node current = root;
        Deque<Node> stack = new LinkedList<>();
        while(current != null || !stack.isEmpty()){ //when stack is not emty
            //or current is not null
            if(current != null){
                stack.addFirst(current);
                current = current.left;
            } else {
                Node temp = stack.peek().right;
                if(temp == null){
                    temp = stack.poll();
                    System.out.println(temp.value + " ");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.poll();
                        System.out.println(temp.value + " ");
                    }
                } else {
                    current = temp;
                }
            }           
        }
                
    }
}
