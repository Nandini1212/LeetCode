/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 */
public class CountOccurencesofKthElement {
    
    public static int count(int[]arr, int target){
        int i = 0;
        int j = 0;
        i = first(arr, 0, arr.length - 1, target);
        
        if(i == -1){
            return i;
        }
        j = last(arr, i, arr.length - 1, target);
      return j - i + 1;
    }
    
    
    public static int last(int[]arr, int low, int high, int target){
       if(low <= high){
           int mid = low + (high - low) / 2;
           if((mid == arr.length - 1 || target < arr[mid + 1]) && arr[mid] == target){
               return mid;
           }else if(target < arr[mid]){
               return last(arr, low, (mid - 1), target);
               
           } else {
               return last(arr, (mid + 1), high, target);
           } 
       }
       return -1;
    }
    
     public static int first(int[]arr, int low, int high, int target){
       if(low <= high){
           int mid = low + (high - low) / 2;
           if((mid == 0 || target > arr[mid - 1]) && arr[mid] == target){
               return mid;
           }else if(arr[mid] < target){
               return first(arr, (mid + 1), high, target);
           } else {
               return first(arr, low, (mid - 1), target);
           } 
       }
       return -1;
    }
    
    
    
    public static void main(String[]args){
        int arr[] = {1, 2, 2, 3, 3, 3, 3};
        System.out.println(count(arr, 2));
    }
}
