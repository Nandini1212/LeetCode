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
public class HeapSort {
    //max heap
    public static void heapify(int [] arr, int sizeOfArray, int index) {
        int left = 2*index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if(left < sizeOfArray && arr[left] > arr[largest]) {
            largest = left;
        }
        if(right < sizeOfArray && arr[right] > arr[largest]) {
            largest = right;
        }
        if(largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(arr, sizeOfArray, index);
        }
    }
    
    public static void sort(int[] arr) {
        int size = arr.length;
        //build heap
        for(int index = size / 2; index >= 0; index--) {
            heapify(arr,size,index);
        }
        //getting one by one element from heap
        for(int index = size -1; index >= 0; index--) {
            //move root node to end
            int temp = arr[0];
            arr[0] = arr[index];
            arr[index] = temp;
            //call max heapify on the reduced heap
            heapify(arr, index, 0);
        }
    }
    public static void main(String [] args) {
        int [] arr = {12, 11, 13, 5, 6, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
