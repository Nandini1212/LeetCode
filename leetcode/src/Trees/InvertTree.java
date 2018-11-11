/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author nandini
 */
class TreeNo {
      int val;
      TreeNo left;
      TreeNo right;
      TreeNo(int x) { val = x; }
  }
public class InvertTree {
     public TreeNo invertTree(TreeNo root) {
         if(root == null){
             return null;
         }
         TreeNo temp = root.left;
         root.left = root.right;
         root.right = temp;
         invertTree(root.left);
         invertTree(root.right);
         return root;
     }
}
