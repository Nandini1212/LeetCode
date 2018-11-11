/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macysPrep;

/**
 *
 * @author nandini
 */
public class TripletSum {
    public static void sum(int[] array, int sum) {
        for(int i = 0; i < array.length - 2; i++) {
            for(int j = i + 1; j < array.length - 1; j++) {
                for(int k = j + 1; k < array.length; k++) {
                    if(sum == array[i] + array[j] + array[k]) {
                        System.out.println(array[i]+","+ array[j]+","+ array[k]); 
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,5,};
        sum(arr,6);
    }
}
