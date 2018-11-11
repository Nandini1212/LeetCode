/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September4th2018;

/**
 *
 * @author nandini
 */
public class DeleteNodeFromBST {
    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }
        if(root.value > key){
            root.leftNode = deleteNode(root.leftNode, key);
        } else if(root.value < key){
            root.rightNode = deleteNode(root.rightNode, key);
        } else {
            if(root.leftNode == null){
                return root.rightNode;
            } else if(root.rightNode == null){
                return root.leftNode;
            }
            TreeNode minNode = findMin(root.rightNode);
            root.value = minNode.value;
            root.rightNode = deleteNode(root.rightNode, minNode.value);
        }
        return root;
        
    }
    public static TreeNode findMin(TreeNode root){
        if(root == null){
            return null;
        }
        return findMin(root.leftNode);
    }
    
}
