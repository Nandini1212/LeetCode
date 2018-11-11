/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoPointers;

/**
 *
 * @author nandini
 */
public class RemoveDuplicatesFromSortedArrayii {
    /*
    public static int removeDuplicates(int[]nums){
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i] = num;//nums[num]
                i++;
            }
        }
        return i;   
    }*/
    public static int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 1;
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                count = 0;
            } else {
                count = count + 1;
            }
            if(count < 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[]args){
        int[]s = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(s));
    }
}
