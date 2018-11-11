/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { 
          val = x;
      } 
}
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root){
        return bfs(root, new ArrayList<Integer>(), 1);
    }
    public static List<Integer> bfs(TreeNode root, List<Integer> list, int level){
        if(root == null){
            return list;
        }
        if(level > list.size()){
            list.add(root.val);
        }
        list = bfs(root.right, list, level + 1);
        list = bfs(root.left, list, level + 1);
        return list;
    }
}
