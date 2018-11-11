/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class RemoveElement {
    /* leet code accepted solution
    public int removeElement(int[] A, int elem) {
    int i=0;
    int j=0;
 
    while(j < A.length){
        if(A[j] != elem){
            A[i] = A[j];
            i++; 
        }
 
        j++;
    }
 
    return i;
}*/
//it prints the array after removing an element
        public static int[] remove(int[] numbers, int target) {
        int count = 0;
        
        // loop over array to count number of target values.
        // this required to calculate length of new array
        for (int number: numbers) {
            if (number == target) {
                count++;
            }
        }

        // if original array doesn't contain number to removed
        // return same array
        if (count == 0) {
            return numbers;
        }

        int[] result = new int[numbers.length - count];
        System.out.println(Arrays.toString(result));
        int index = 0;
        for (int value : numbers) {
            if (value != target) {
                result[index] = value;
                index++;
            }
        }
        numbers = null; // make original array eligible for GC         
        return result;
        }


        public static void main(String[] args) {
            int[]nums = {3,2,2,3,3,2,4,2};
            System.out.println("input : " + Arrays.toString(nums) + ", remove 4"); 

            int[] output = remove(nums, 4);
            System.out.println(Arrays.toString(output));
        }
    
}
