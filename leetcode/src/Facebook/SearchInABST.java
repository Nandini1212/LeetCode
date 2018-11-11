/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.Arrays;

/**
 *
 * @author nandini
 * Since its BST for every node check if root.data is key and if not go either left or
 * right depending on if root.data is greater or less than key
 * 
 * Time complexity is O(n) for non balanced BST
 * Time complexity is O(logn) for balanced BST
 * 
 * Test cases:
 * 1) null tree
 * 2) Tree with one node and key is that node
 * 3) Tree with many nodes and key does not exist
 * 4) Tree with many nodes and key exist
 */
class tree{
    int value;
    tree left;
    tree right;
    tree(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class SearchInABST {
    public static tree searchBST(tree root, int val) {
        if(root == null){
            return null;
        }
        if(root.value == val){
            return root;
        }else if(root.value < val){
            return searchBST(root.right, val);
        }else{
            return searchBST(root.left, val);
        }

    }
    public static void main(String [] args){
        tree root = new tree(4);
        root.left = new tree(2);
        root.right = new tree(7);
        root.left.left = new tree(1);
        root.left.right = new tree(3);
        System.out.println(String.valueOf(searchBST(root,2)));
        
    }
    
}





