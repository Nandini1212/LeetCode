/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nandini
 */

class TreeNodee{
    int val;
    TreeNodee left;
    TreeNodee right;
    TreeNodee(int data){
        val = data;
    }
}
public class AllNodesDistanceKinBinaryTree {
     HashMap<TreeNodee, Integer> map = new HashMap<>();
        
    public List<Integer> distanceK(TreeNodee root, TreeNodee target, int K) {
        List<Integer> res = new LinkedList<Integer>();
        find(root, target);
        dfs(root, target, K, map.get(root), res);
        return res;
    }
    
    // find target node first and store the distance in that path that we could use it later directly
    private int find(TreeNodee root, TreeNodee target) {
        if (root == null) return -1;
        if (root == target) {
            map.put(root, 0);
            return 0;
        }
        int left = find(root.left, target);
        if (left >= 0) {
            map.put(root, left + 1);
            return left + 1;
        }
	int right = find(root.right, target);
	if (right >= 0) {
            map.put(root, right + 1);
            return right + 1;
        }
        return -1;
    }
    
    private void dfs(TreeNodee root, TreeNodee target, int K, int length, List<Integer> res) {
        if (root == null) return;
        if (map.containsKey(root)) length = map.get(root);
        if (length == K) res.add(root.val);
        dfs(root.left, target, K, length + 1, res);
        dfs(root.right, target, K, length + 1, res);
    }
    
    public static void main(String[]args){
         TreeNodee tree = new TreeNodee(3);
        tree.left = new TreeNodee(5);
        tree.left.left = new TreeNodee(6);
        tree.left.right = new TreeNodee(2);
        tree.left.right.left = new TreeNodee(7);
        tree.left.right.right = new TreeNodee(4);
        tree.right = new TreeNodee(1);
        tree.right.left = new TreeNodee(0);
        tree.right.right = new TreeNodee(8);
        
        AllNodesDistanceKinBinaryTree root = new AllNodesDistanceKinBinaryTree();

        System.out.println(root.distanceK(tree, tree.left.right, 2));
        
    }
}
