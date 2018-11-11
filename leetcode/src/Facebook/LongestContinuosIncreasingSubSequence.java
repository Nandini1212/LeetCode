/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 * time complexity : O(n)
 */
public class LongestContinuosIncreasingSubSequence {
    public static int findLengthOfLCIS(int[] nums) {
        int max = 1; int len = 1;
        if(nums.length == 0 || nums == null){
            return 0;
        }
        for(int index = 1; index < nums.length; index++){
            if(nums[index] > nums[index - 1]){
                System.out.println(nums[index]);
                len++;
            }
            else {
                if(max < len){
                    max = len;
                }
                len = 1;//reset length
            }
        }
        if(max < len){
            max = len;
        } 

        return max;
        
    }
    
    public static void main(String[]args){
         int arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2};
           
            System.out.println("Length = " +
                      findLengthOfLCIS(arr));
         
        }
    }

