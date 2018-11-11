/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author nandini
 */
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = low+(high-low) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[] = {2, 3, 4, 10, 40};
         System.out.println(search(arr, 11));
    }
    
}
