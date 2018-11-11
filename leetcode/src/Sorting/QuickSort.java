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

/*There are two indices i and j and at the very beginning of the partition algorithm i points to the first element in the array and j points to the last one. 
Then algorithm moves i forward, until an element with value greater or equal to the pivot is found. 
Index j is moved backward, until an element with value lesser or equal to the pivot is found. 
If i ≤ j then they are swapped and i steps to the next position (i + 1), 
j steps to the previous one (j - 1). Algorithm stops, 
when i becomes greater than j.
After partition, all values before i-th element are less or equal than the pivot and all values after j-th element are greater or equal to the pivot.

*/
public class QuickSort {
    
    /*brute force
    public static int []quickSort(int [] arr, int start, int end, int pivotIndex){
        start = 0;
        end = arr.length - 1;
        int lessThanCount = 0;
        int resultArr [] = new int[end + 1];
        for(int index = start; index <= end; start++) {
            if(arr[index] < arr[pivotIndex]) {
                lessThanCount++; //no.of elements before the pivot index including pivot
            }
            
        }
        resultArr[lessThanCount - 1] = arr[pivotIndex]; //lessThanCount-1 is no.of elements before the pivot
        int greaterCount = lessThanCount;
        for(int i = start; i <= end; i++) {
            if(arr[i] == arr[pivotIndex]) {
                continue;
            } else if(arr[i] < arr[pivotIndex]) {
                resultArr[lessThanCount + 1] = arr[i];
                System.out.println(resultArr);
            } else {
                resultArr[greaterCount + 1] = arr[i];
            }
            
        }
        return resultArr;
    }*/
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }
    //this function takes last element as pivot element
    public static int partition(int[]arr, int low, int high) {
        int left = low;
        int right = high;
        int temp;
        int pivot = arr[(left+right)/2];
        while(left <= right) {
            while(arr[left] < pivot) {
                left++;
                System.out.println("left is :" + left);
            }
            while(arr[right] > pivot) {
                right--;
                System.out.println("right is :" + right);
            }
            if(left <= right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                System.out.println("arr[right] is :" + arr[right]);
                left++;
                right--;
            }
        }
        System.out.println("final left : " + left);
        return left;

    }
    
    public static void quickSort(int [] arr, int low, int high) {
        if(low >= high){
            return;
        }
        System.out.println("arr is :" + Arrays.toString(arr));
        int index = partition(arr, low, high);
        System.out.println("index is " + index);
        if(low < index -1) {
            System.out.println("low is :" + low +"index - 1 is "+(index - 1));
            quickSort(arr, low, index - 1);
            
        }
        if(high > index) {
            System.out.println("high is :" + high +"index is "+(index));
            quickSort(arr, index, high);
        }
        //System.out.println(Arrays.toString(arr));
    }
    
    /*public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}*/

    public static void main(String[] arr) {
        int[]arra = {1,12,5,26,7,14,3,7,2};
        quickSort(arra, 0, arra.length - 1);
        System.out.println(Arrays.toString(arra));
    }
    
}
