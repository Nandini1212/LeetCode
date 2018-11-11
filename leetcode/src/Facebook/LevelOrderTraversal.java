/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Optional
 * Is it possible that a solution exists using only one single queue? 
 * Yes, you bet. The single queue solution requires two extra counting variables 
 * which keep tracks of the number of nodes in the current level (nodesInCurrentLevel)
 * and the next level (nodesInNextLevel). When we pop a node off the queue,
 * we decrement nodesInCurrentLevel by one.
 * When we push its child nodes to the queue, we increment nodesInNextLevel by two. 
 * When nodesInCurrentLevel reaches 0, 
 * we know that the current level has ended, 
 * therefore we print an endline here.
 *
 * @author nandini
 * take a queue, add a root to queue
 * then pop the head from queue
 * then add left and right children to queue till queue is empty
 * 
 * In order to print the binary tree in level order with newline in the end of each level, 
 * we can utilize two queues. The first queue stores the current level’s nodes,
 * while the second queue stores the next level’s nodes (the current level nodes’ children).

When the first queue is emptied, 
* we know that it must have reached the end of the current level,
* therefore we print a newline. 
* Then, we switch the emptied first queue with the second queue 
* (which is populated with the next level’s nodes). Then we repeat the process over again.
 */
class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int item){
        value = item;
        left = null;
        right = null;
    }
}
class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> current = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();
        if(root == null){
            return result;
        }
        current.offer(root);
        while(!current.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            while(!current.isEmpty()){
            TreeNode node = current.poll();
            level.add(node.value);
            if(node.left != null){
                next.add(node.left);
            }
            if(node.right != null){
                next.add(node.right);
            }
            }
            result.add(level);
            Queue<TreeNode> q = current;
            current = next;
            next = q;
        }
        
        return result;
    }
 
    BinaryTree root;
 
    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    /*
    void printLevelOrder() 
    {
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        queue.add(root);
        while (!queue.isEmpty()) 
        {

            BinaryTree tempNode = queue.poll();
            System.out.print(tempNode.value + " ");
 
            /*Enqueue left child */
    /*
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
 
            /*Enqueue right child */
    /*
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }*/
 
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        LevelOrderTraversal tree_level = new LevelOrderTraversal();
        tree_level.root = new BinaryTree(1);
        tree_level.root.left = new BinaryTree(2);
        tree_level.root.right = new BinaryTree(3);
        tree_level.root.left.left = new BinaryTree(4);
        tree_level.root.left.right = new BinaryTree(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.levelOrder(root);
    }
}
