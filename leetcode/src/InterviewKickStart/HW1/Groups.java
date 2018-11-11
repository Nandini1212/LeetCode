/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

import static Sorting.QuickSort.swap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nandini
 */
public class Groups {
    /*
    public static int[] solve(int[] arr) {
        if(arr.length == 0) {
            return null;
        }
        if(arr.length == 1){
            return arr;
        }
        int j = -1;
        int temp;
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] % 2 == 0){
                j++;
                temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;           
            }
       
        }
        return arr;
    }*/
    
    public static void grouping(int [] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            while(arr[i] < 0 && i < j) {
                i++;
            }
            while(arr[j] > 0 && i < j) {
                j--;
            }
            if(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        } else {
                break;
            }  
        }
    
        for(int index = 0; index < arr.length; index++) {
        System.out.println(arr[i]);
    }
        
    }
    public static void main(String[] args) {
        int [] num = {5,1,6,3,4,4,5,-1,-2};
        grouping(num);
    }
    
    //[-2, 4, 4, 6, 3, 1, 5, -1, 5]
    
    
}
