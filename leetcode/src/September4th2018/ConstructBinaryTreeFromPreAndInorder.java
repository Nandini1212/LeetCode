/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September4th2018;

/**
 *
Recursively find the node that has the same value as the key, 
* while setting the left/right nodes equal to the returned subtree
Once the node is found, have to handle the below 4 cases
node doesn't have left or right - return null
node only has left subtree- return the left subtree
node only has right subtree- return the right subtree
node has both left and right - find the minimum value in the right subtree, 
* set that value to the currently found node, 
* then recursively delete the minimum value in the right subtree
Complexity:O(lgN -- height of tree)
 *
 * @author nandini
 */
class Node{
    int value;
    Node left;
    Node right;
    Node(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class ConstructBinaryTreeFromPreAndInorder {
    public static Node buildTree(int [] preOrder, int [] inOrder){
        return buildTre(preOrder, 0, preOrder.length - 1,
                inOrder, 0, inOrder.length - 1);
    }
    public static Node buildTre(int []preOr, int preStart, int preEnd, int[]inOr,
    int inStart, int inEnd){
        if(inStart > inEnd || preStart > preEnd){
            return null;
        }
        int rootVal = preOr[preStart];
        int rootIndex = 0;
        
        for(int i = inStart; i <= inEnd; i++){
            if(inOr[i] == rootVal){
                rootIndex = i;
                break;
            }
        }
        int len = rootIndex - inStart;
        Node root = new Node(rootVal);
        
        root.left = buildTre(preOr, preStart + 1, preStart + len,
                inOr, inStart, rootIndex - 1);
        
        root.right = buildTre(preOr, preStart + len + 1, preEnd,
                inOr, rootIndex + 1, inEnd);
        return root;
        
    }
    

}
