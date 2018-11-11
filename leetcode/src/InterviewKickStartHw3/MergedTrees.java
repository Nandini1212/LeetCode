/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author nandini
 * first do inorder traversal on both trees and store those values on
 * two arrayLists
 * merge on two arraylists
 * then convert to balanced binary search tree
 */


class Merge{
    int value;
    Merge left;
    Merge right;
    Merge(int item){
        value = item;
        left = null;
        right = null;
    }
    
}
public class MergedTrees {
    public static void inorderIterative(Merge root){
        Stack<Merge> stack = new Stack<Merge>();
        Merge current = root;
        while(current != null && !stack.isEmpty()){
            if(current != null){
                stack.push(root);
                current = current.left;
            } else {
                Merge n = stack.pop();
                System.out.println(" " +root.value);
                current = n.right;
            }
            
        }
    }
    public ArrayList<Integer> convertToArrayList(Merge root, ArrayList<Integer> list){
        if (root == null){
            return list;
        }
        convertToArrayList(root.left, list);
        list.add(root.value);
        convertToArrayList(root.right, list);
        return list;
    }
    Merge mergeTrees(Merge tree1, Merge tree2){
        ArrayList<Integer> list1 = inorderIterative(tree1);
        ArrayList<Integer> list2 = inorderIterative(tree2);
    }
    public static int[] merge(int [] arr1, int [] arr2){
          int n = arr1.length;

	// Start merging from the end. 
	int last1 = n - 1;
	int last2 = n - 1;
	int last = n + n - 1;
	while (last >= 0){
        if (last1 < 0)
		{
			arr2[last--] = arr2[last2--];
		}
		// If no elements remaining in arr2.
		else if (last2 < 0)
		{
			arr2[last--] = arr1[last1--];
		}
		// Priority to larger element, as we are merging from the end. 
		else if (arr1[last1] <= arr2[last2])
		{
			arr2[last--] = arr2[last2--];
		}
		else
		{
			arr2[last--] = arr1[last1--];
		}
	}
	return arr2;
    }
    
    
    
    
}
