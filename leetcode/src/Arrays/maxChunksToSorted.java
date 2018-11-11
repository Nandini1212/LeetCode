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
public class maxChunksToSorted {
    public static int maxChunksToSorted(int[]arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int max = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            if(max == i){
                count++;
            }
        }
        return count;
    }
    
    
    // sorted ii duplicate elements allowed
    public static int maxChunksToSorteds(int[] arr) {
        int [] minRight = new int[arr.length];
        int [] maxLeft = new int[arr.length];
        maxLeft[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            maxLeft[i] = Math.max(maxLeft[i - 1], arr[i]); 
        }
        minRight[arr.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            minRight[i] = Math.min(minRight[i + 1], arr[i]);
        }
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(maxLeft[i] <= minRight[i + 1]){
                count++;
            }
        }
        return count + 1;
    }
    public static void main(String[]args){
        int [] arr = {2,1,3,4,5};
        int [] arr1 = {2,1,3,4,4};
        System.out.println(maxChunksToSorted(arr));
        System.out.println(maxChunksToSorteds(arr1));
    }
}
