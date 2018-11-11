/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author nandini
 */
public class LargestNumberAtleastTwiceOfOthers {
    public static int dominantIndex(int [] nums){
        int first = 0;
        int second = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > first){
                second = first;
                first = nums[i];
                index = i;
            } else if(nums[i] > second){
                second = nums[i];
            }
        }
        if(first >= second * 2){
            return index;
        } else {
            return -1;
        }
    }
    public static void main(String[]args){
        int[]arr = {3,2,1,6,0};
        System.out.println(dominantIndex(arr));
    }
}
