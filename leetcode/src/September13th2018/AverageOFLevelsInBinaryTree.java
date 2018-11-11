/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September13th2018;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Put the root node into the queuequeue.

Initialize sumsum and countcount as 0 and temptemp as an empty queue.

Pop a node from the front of the queuequeue. Add this node's value to the sumsum corresponding to the current level. Also, update the countcount corresponding to the current level.

Put the children nodes of the node last popped into the a temptemp queue(instead of queuequeue).

Continue steps 3 and 4 till queuequeue becomes empty. (An empty queuequeue indicates that one level of the tree has been considered).

Reinitialize queuequeue with its value as temptemp.

Populate the resres array with the average corresponding to the current level.

Repeat steps 2 to 7 till the queuequeue and temptemp become empty.
 */
public class AverageOFLevelsInBinaryTree {
    public List<Double>averageOfLevels(TreeNode root){
        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            Queue<TreeNode>sub = new LinkedList<>();
            long sum = 0;
            long count = 0;
            while(!queue.isEmpty()){
                TreeNode temp = queue.remove();
                sum += temp.val;
                count++;
                if(temp.left != null){
                    sub.add(temp.left);
                }
                if(temp.right != null){
                   sub.add(temp.right);
                }
            }
            queue = sub;
            list.add(sum * 1.0 / count);
        }
        return list;
    }
}
