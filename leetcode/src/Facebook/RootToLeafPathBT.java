/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 * 1) Create an empty queue q
2) temp_node = root /*start from root
3) Loop while temp_node is not NULL
    a) print temp_node->data.
    b) Enqueue temp_node’s children (first left then right children) to q
    c) Dequeue a node from q and assign it’s value to temp_node
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
public class RootToLeafPathBT {
    
        public static List<String> binaryTreePaths(Tree root) {
	List<String> res = new ArrayList<>();
        if(root == null){
            return res;
        }
	dfs(root, String.valueOf(root.value), res);
	return res;
}
        public static void dfs(Tree root,String str, List<String> list){
            if(root == null){
                return;
            }

            if(root.left == null && root.right == null){
                list.add(str);
                return;
            }
            if(root.left != null){
                    
               dfs(root.left, str+"->"+String.valueOf(root.left.value), list);
            } 
            if(root.right != null){
                dfs(root.right, str+"->"+String.valueOf(root.right.value), list);
            }
        }
        public static void main(String [] args){
        Tree root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
   
        System.out.println(binaryTreePaths(root));

    }
    

    
}
