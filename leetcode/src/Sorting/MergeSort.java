/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class MergeSort {
    public static void merge(int [] arr, int left, int middle, int right) {
        int leftSubArraySize = middle - left + 1;
        int rightSubArraySize = right - middle;
        
        int leftSubArray [] = new int[leftSubArraySize];
        int rightSubArray [] = new int[rightSubArraySize];
        
        for(int index = 0; index < leftSubArraySize; index++) {
            leftSubArray[index] = arr[left + index];
        }
        for(int index = 0; index < rightSubArraySize; index++) {
            rightSubArray[index] = arr[middle + 1 + index];
            
       }
        
        int leftIndex = 0;
        int rightIndex = 0;
        int k = left;
        
        while(leftIndex < leftSubArraySize && rightIndex < rightSubArraySize) {
            if(leftSubArray[leftIndex] <= rightSubArray[rightIndex]) {
                arr[k] = leftSubArray[leftIndex];
                leftIndex++;
                k++;
            } else {
                arr[k] = rightSubArray[rightIndex];
                rightIndex++;
                k++;
            }
            
        }
        //remaining elements
        while(leftIndex < leftSubArraySize) {
            arr[k] = leftSubArray[leftIndex];
            leftIndex++;
            k++;
        }
        while(rightIndex < rightSubArraySize) {
            arr[k] = rightSubArray[rightIndex];
            rightIndex++;
            k++;
        }
        
        
    }
    public static void mergeSort(int arr[], int left, int right) {
        if(left >= right) {
            return;
        }
        
        if(right > left) {
            int mid = left + (right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void printArray(int[]arr){
        for(int index = 0; index < arr.length; index++) {
            System.out.println("array is : " + arr[index]);
        }
    }
    public static void main(String [] args) {
        int[] arr = {12, 11, 13, 5, 6,13, 7};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        //printArray(arr);
    }
    
}
