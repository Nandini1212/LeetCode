/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September4th2018;

/**
 *
 * @author nandini
 * helper functions returns max num of robs of the current node as the root node.
 * the left and right parameters represent the maximum amount that can be obatained from
 * the left child node and right child node respectively.
 * if nothing in the root, it will simply return 0. orelse call recursive function on the left child and right 
 * child nodes to get left and right values. the parameters ll, lr, rl, rr represents max amount of money robbed from left
 * child node and right child node. then we return max of left child node and right child node and root value.
 * 
 * 
 * 
 * 
 * The native solution is just to use DFS. For each node, 
 * we have two cases to consider: rob root and no rob root.
 * If rob the root, the max value depends on the root's grandchildren. 
 * If not rob the root, the max value depends on the root's children. 

 */
class TreeNode {
    int value;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode(int value){
        leftNode = null;
        rightNode = null;
    }
}
public class HouseRobberiii {
    public static int rob(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.leftNode == null && root.rightNode == null){
                return root.value;
        }
        //rob the root
        int leftMax = 0;
        int rightMax = 0;
        if(root.leftNode != null){
            leftMax = rob(root.leftNode.leftNode) + rob(root.leftNode.rightNode);
        }
        if(root.rightNode != null){
            rightMax = rob(root.rightNode.leftNode) + rob(root.rightNode.rightNode);
        }
        int maxRoot = root.value + leftMax + rightMax;
        //not rob the root
        leftMax = rob(root.leftNode);
        rightMax = rob(root.rightNode);
        
        int maxNoRoot = leftMax + rightMax;
        return Math.max(maxRoot, maxNoRoot);
    }
    
        
}
