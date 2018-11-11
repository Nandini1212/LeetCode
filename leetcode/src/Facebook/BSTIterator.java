/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.Stack;

/**
 *
 * @author nandini //all are tree nodes. IDE Not allow me to create
 * TreeNode class
 * 
 * add all left nodes to the stack until it is empty
 * we never add a left node to stack but once leftNodes are empty to pop
 * the element which is on top of the stack then we will go for right side
 * as soon as root is null we pop from the stack
 * and print that element
 */
public class BSTIterator {
    Stack<Node>stack = new Stack<Node>();
    Node currentNode;
    public BSTIterator(Node root) {
        currentNode = root;
        stack =  new Stack<Node>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
         if (stack.isEmpty() == true && currentNode == null) return false;
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        while(currentNode != null){
            stack.push(currentNode);
            currentNode = currentNode.left;
        }
        Node res = stack.pop();
        int result = 0;
        result = res.value;
        //Now I will take care of my right
        currentNode = currentNode.right; // make root as stack.pop() value right
        return result;
    }
    
}
