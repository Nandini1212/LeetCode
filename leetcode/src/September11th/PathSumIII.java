/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September11th;

/**
 do two recursion. different from pathSumII that start can be any node, 
 * so we have 1st recur.
1st： recursively travel tree to find answers of current node + ans of left child + ans of right child.
2nd: find the path from current node to child that adds up to sum
Complexity:  
If the tree is balanced, then each node is reached from its ancestors (+ itself) 
only, which are up to log n. Thus, the time complexity for a balanced tree is O (n * log n).
However, in the worst-case scenario where the binary 
tree has the same structure as a linked list, the time complexity is indeed O (n ^ 2)
O(H) space - height of binary tree
 */
class TreeNod {
     int val;
      TreeNod left;
      TreeNod right;
      TreeNod(int x) { val = x; }
  }
public class PathSumIII {
    public static int pathSum(TreeNod root, int sum){
        if(root == null){
            return 0;
        }
        return helper(root, sum) + helper(root.left, sum) + helper(root.right, sum);
    }
    public static int helper(TreeNod root, int sum){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.val - sum == 0){
            count++;
        }
        count += helper(root.left, sum - root.val);
        count += helper(root.right, sum - root.val);
        return count;
    }
    public static void main(String[]args){
        TreeNod root = new TreeNod(10);
        root.left = new TreeNod(5);
        root.right = new TreeNod(-3);
        root.left.left = new TreeNod(3);
        root.left.left.left = new TreeNod(3);
        root.left.left.right = new TreeNod(-2);
        root.left.right = new TreeNod(2);
        root.left.right.right = new TreeNod(1);
        root.right.right = new TreeNod(-3);
        root.right.right.right = new TreeNod(11);
        System.out.println(pathSum(root, 8));
    }
}
