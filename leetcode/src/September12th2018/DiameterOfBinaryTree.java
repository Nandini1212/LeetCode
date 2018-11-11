/*
 The diameter of a tree is the number of nodes on the longest path between two leaves 
in the tree.
 * The diameter of a tree T is the largest of the following quantities:
 * the diameter of T's left subtree
 * the diameter of T's right subtree
 * the longest path between leaves that go through the root of T (can be computed from the heights
of all the subtrees of T)
 */
package September12th2018;

class TreNode {
      int val;
      TreNode left;
      TreNode right;
      TreNode(int x) { val = x; }
  }
 
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreNode root){
        if(root == null){
            return 0;
        }
        //heights of left and right subtree
        int leftHeight = heightOfBinaryTree(root.left); 
        int rightHeight = heightOfBinaryTree(root.right);
        
        //diameters of left and right subtrees
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        
        //return max of
        //diameter of left and right subtree and height of
        //left subtree + right subtree + 1
        
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }
    public static int heightOfBinaryTree(TreNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right));
    }
        
}
