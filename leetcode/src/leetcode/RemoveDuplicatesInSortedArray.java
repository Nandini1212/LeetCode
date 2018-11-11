/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nandini
 */
public class RemoveDuplicatesInSortedArray {
    /*count number of unique elements
    public static int removeDuplicates(int[] A) {
     int count = 0;
     for(int index = 0; index < A.length - 1; index++) {
         if(A[index] == A[index+1]) {
             count++;
         }
     }
     return(A.length - count);
*/
    public static int removeDuplicates(int[] A) {
        int index = 1;
        int j = 0;
        int result [] = new int[34];
        for(index = 1; index < A.length - 1; index++) {
            if(A[index] != A[j]) {
                j++;
                A[j+1] = A[index];
            }
        }
        
            return j + 1; 
    }
    public static void main(String [] args) {
        int [] nums = {1,1,1,2,2,3};
        int num = removeDuplicates(nums); 
        System.out.println(removeDuplicates(nums));
        
        
    
        
    }
}
