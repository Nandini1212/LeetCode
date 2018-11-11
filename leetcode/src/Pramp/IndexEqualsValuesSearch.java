/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pramp;

/**
 *
 * @author nandini
 */
public class IndexEqualsValuesSearch {
    public static int indexEqualsValueSearch(int[]arr){
        int min = Integer.MAX_VALUE;
        if(arr.length == 0 || arr == null){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == i){
                return i;
                
            } 
            
        }
        return -1;
    }
    public static void main(String[]args){
        int[]arr = {-8, 0, 0, 0, 4};
        System.out.println(indexEqualsValueSearch(arr));
    }
}
