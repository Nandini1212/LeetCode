/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

import java.util.ArrayList;
import java.util.Stack;



/**
 *
 * @author nandini
 */
class Tree{
    int value;
    Tree left;
    Tree right;
    Tree(int item){
        left = null;
        right = null;
        value = item;
    }
}
public class PrintAllPaths {
    public static void printPaths(Tree root){
        
        printAllPaths(root, "");
        
    }
    static void printAllPaths(Tree root,String str){
        if(root == null){
            return;
        }
        //list.add(root.value);
        if(root.left == null && root.right == null){
            
           System.out.println(str + root.value);
            return;
        }
        if(root.left != null){
        printAllPaths(root.left, str + root.value + " ");
        }
        if(root.right != null){
        printAllPaths(root.right, str + root.value + " ");
        }
    }

 
        
    public static void main(String [] args){
        Tree root = new Tree(12);
        root.left = new Tree(6);
        root.right = new Tree(19);
        root.left.right = new Tree(8);
        root.left.left = new Tree(-23);
        root.right.left = new Tree(18);
        root.right.right = new Tree(52);
        printPaths(root);
       // display(root);
}
}
