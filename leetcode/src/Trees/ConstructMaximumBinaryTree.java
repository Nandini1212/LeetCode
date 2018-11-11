/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author nandini
 */
class TreeNod {
      int val;
      TreeNod left;
      TreeNod right;
      TreeNod(int x) { val = x; }
}
public class ConstructMaximumBinaryTree {
    /*using a stack to store, if the current element is larger than the top element 
of the stack, then the top element of the stack is the left child of the current element;
conversely, the current element is the right child of the top element of the stack .
*/
    public static TreeNod constructMaximumBinaryTree(int[] nums) {
        LinkedList<TreeNod> list = new LinkedList<TreeNod>();
        System.out.println(list);
        for(int i = 0; i < nums.length; i++){
            TreeNod current = new TreeNod(nums[i]);
            System.out.println(current);
            while(!list.isEmpty() && list.peek().val < nums[i]){
                current.left = list.pop();
            }
            if(!list.isEmpty()){
                list.peek().right = current;
            }
            list.push(current);
        }
        if(list.isEmpty()){
            return null;
            
        }
  
        return list.removeLast();
    }
    
    public static TreeNod constructMaximumBinaryTrees(int [] nums){
        return binarySearch(nums, 0, nums.length -1);
    }
    public static TreeNod binarySearch(int[]nums, int left, int right){
        if(left >= right){
            return null;
        }
        if(left == right){
            return new TreeNod(nums[left]);
        }
        int max = nums[left];
        int index = left;
        for(int i = left; i <= right; i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        TreeNod root = new TreeNod(max);
        root.left = binarySearch(nums, left, index - 1);
        root.right = binarySearch(nums, index + 1, right);
        return root;
    }
    public static void main(String[]args){
        int[]arr = {3,2,1,0,5};
        TreeNod tc = constructMaximumBinaryTree(arr);
        System.out.println(tc);
        
    }
    
}
