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
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {

            int i=0; 
    int j=nums.length-1;
 
    while(i<=j){
        int mid = (i+j)/2;
 
        if(target > nums[mid]){
            i=mid+1;
        }else if(target < nums[mid]){
            j=mid-1;
        }else{
            return mid;
        }
    }
 
    return i;
    }
    public static void main(String args[]) {
        int arr[] = {1,2};
        System.out.println(searchInsert(arr, 1));
    }
}
