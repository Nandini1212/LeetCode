/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September5th2018;

/**
 *
 * @author nandini
 * //Time O(n), Space O(1). 

 */
public class PivotIndex {
    public static int pivotIndex(int [] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int sumLeft = 0;
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        for(int i = 0; i < nums.length; i++){
            if(sumLeft == sum - sumLeft - nums[i]){
                System.out.println("sumLeft : " + sumLeft + "sum :"+sum + "nums[i] : "+nums[i]);
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
    public static void main(String [] args){
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
