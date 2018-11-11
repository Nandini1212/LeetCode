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
public class KthSmallestElementInArray {
    public static int partition(int [] arr, int low, int high){
        int start = low + 1;
        int end = high;
        int pivot = low;
        while(start < end){
            while((arr[pivot] > arr[start]) && start < high){
                start++;
            }
            while((arr[pivot] < arr[end]) && end >= low){
                end--;
            }
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
               
            }
            int temp = arr[end];
            arr[end] = arr[pivot];
            arr[pivot] = temp;
            
        }
        return end;
    }
    
    public static int kthSmallest(int[]arr, int start, int end, int k){
        if(start <= end){
            int pivot = partition(arr, start, end);
            if(pivot == k - 1){
                return arr[pivot];
            }
            else if(pivot > k - 1){
                return kthSmallest(arr, start, pivot - 1, k);
            } else {
            return kthSmallest(arr, pivot + 1, end, k);
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) 
    { 
        int arr[] = {7,10,4,3,20,15}; 
        int k = 3; 
        System.out.print( "K'th smallest element is " + 
                     kthSmallest(arr, 0, arr.length - 1, k) ); 
    } 
}
