/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September14th2018;

/**
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class FindTheDuplicateNumberNoSpace {
    public static int findDuplicate(int[]nums){
        int low = 1, high = nums.length - 1;
        while(low < high){
            
            int mid = low + (high - low) / 2;
            int count = 0;
            
            for(int i : nums){
                if(i <= mid){
                    count++;
                }
                
            }
            if(count > mid){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
    public static void main(String[]args){
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
