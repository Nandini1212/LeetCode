/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/*Time Complexity - O(n)， Space Complexity - O(n)。


 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return binarySearch(nums, 0, nums.length - 1);
    }
    public static TreeNode binarySearch(int[] arr, int low, int high){
        
        if(low > high){
            return null;
        }
            int mid = low + (high - low) / 2;
            TreeNode root = new TreeNode(arr[mid]);
            root.left = binarySearch(arr, low, mid - 1);
            root.right = binarySearch(arr, mid + 1, high);
            return root;

    }
    public static void main(String[]args){
        int [] nums = {-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }
}
