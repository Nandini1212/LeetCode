/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitwise;

/**
 *
 * @author nandini
 */
public class SingleNumber {
    public static int singleNumber(int[]arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result ^= arr[i];
            System.out.println("result :" + result);
        }
        return result;
    }
    public static void main(String[]args){
        int [] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
