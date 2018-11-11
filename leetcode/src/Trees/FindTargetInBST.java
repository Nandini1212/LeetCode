/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author nandini
 */
//time and space O(n)
public class FindTargetInBST {
    public boolean findTarget(TreeNodee root, int k){
        if(root == null){
            return false;
        }
        HashSet<Integer>set = new HashSet<Integer>();
        return helper(set, root, k);
    }
    public boolean helper(HashSet<Integer>set, TreeNodee root, int k){
        if(root == null){
            return false;
        }
        if(set.contains(k - root.val)){
            return true;
        }
        set.add(root.val);
        return helper(set, root.left, k) || helper(set, root.right, k);
    }
    
    // using BST
    public boolean findTargets(TreeNodee root, int k){
        List<Integer>list = new ArrayList<>();
          inOrder(root, k);
        int l = 0;
        int r = list.size() - 1;
      
        while(l < r){
            int sum = list.get(l) + list.get(r);
            if(sum == k){
                return true;
            }
            if(sum < k){
                l++;
            } else {
                r--;
            }
            
        }
        return false;
        
    }
    public void inorder(TreeNodee root, List < Integer > list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    
    
    
    // time : O(n)
    //Space : O(logn)
    
    public boolean findTarget(TreeNodee root, int k) {
        if (root == null) {
            return false;
        }
        Stack<TreeNodee> leftStack = new Stack<TreeNodee>();
        Stack<TreeNodee> rightStack = new Stack<TreeNodee>();
        initStack(leftStack, root, true);
        initStack(rightStack, root, false);
        while (leftStack.peek() != rightStack.peek()) {
            int sum = leftStack.peek().val + rightStack.peek().val;
            if (sum == k) {
                return true;
            } else if (sum > k) {
                findNext(rightStack, false);
            } else {
                findNext(leftStack, true);
            } 
        }
        return false;
    }
    private void initStack(Stack<TreeNodee> stack, TreeNodee node, boolean isLeft) {
        TreeNodee cur = node;
        while (cur != null) {
            stack.push(cur);
            cur = isLeft ? cur.left : cur.right;
        }
    }
    private void findNext(Stack<TreeNodee> stack, boolean isLeft) {
        TreeNodee cur = stack.pop();
        if (isLeft) {
            initStack(stack, cur.right, isLeft);
        } else {
            initStack(stack, cur.left, isLeft);
        }
    }
}
