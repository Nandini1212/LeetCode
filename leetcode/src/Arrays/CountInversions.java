/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author nandini
 * http://www.techiedelight.com/inversion-count-array/
 */
public class CountInversions {
     public static int merge(int[] arr, int[] aux, int low, int mid, int high)
    {
        int k = low, i = low, j = mid + 1;
        int inversionCount = 0;

        // While there are elements in the left and right runs
        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
                inversionCount += (mid - i + 1);    // NOTE
            }
        }

        // Copy remaining elements
        while (i <= mid)
            aux[k++] = arr[i++];

        // Don't need to copy second half

        // copy back to the original array to reflect sorted order
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }

        return inversionCount;
    }

    // Sort array arr [low..high] using auxiliary array aux[]
    public static int mergeSort(int[] arr, int[] aux, int low, int high)
    {
        // Base case
        if (high == low) {    // if run size == 1
            return 0;
        }

        // find mid point
        int mid = (low + ((high - low) >> 1));
        int inversionCount = 0;

        // recursively split runs into two halves until run size == 1,
        // then merge them and return back up the call chain

        inversionCount += mergeSort(arr, aux, low, mid);      // split / merge left  half
        inversionCount += mergeSort(arr, aux, mid + 1, high); // split / merge right half
        inversionCount += merge(arr, aux, low, mid, high);    // merge the two half runs

        return inversionCount;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 9, 6, 4, 5 };
        int[] aux = Arrays.copyOf(arr, arr.length);

        // get inversion count by performing merge sort on arr
        System.out.println("Inversion count is " + 
                         mergeSort(arr, aux, 0, arr.length - 1));
    }
}
