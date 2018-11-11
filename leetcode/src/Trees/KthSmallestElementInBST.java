/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class KthSmallestElementInBST {
    //Time Complexity - O(n)， Space Complexity - O(1)


    private int count = 0;
    private int res = 0;
    
    public int kthSmallest(TreeNodee root, int k){
        if(root == null){
            return 0;
        }
        inorder(root, k);
        return res;
    }
    public void inorder(TreeNodee root, int k){
        if(root == null){
            return;
        }
        if(count >= k){
            return;
        }
        inorder(root.left, k);
        if(count >= k){
            return;
        }
        res = root.val;
        count++;
        inorder(root.right, k);
        
    }
    //Time Complexity - O(k)， Space Complexity - O(k)。


    public int kthsmallest(TreeNodee root, int k){
        List<Integer> res = new ArrayList<Integer>();
        inOrder(res, root, k);
        if(res.size() >= k){
            return res.get(k - 1);
        } else {
            return 0;
        }
    }
    public void inOrder(List<Integer>list, TreeNodee root, int k){
        if(root == null || list.size() >= k){
            return;
        }
        inOrder(list, root.left, k);
        list.add(root.val);
        inOrder(list, root.right, k);
    }
}
