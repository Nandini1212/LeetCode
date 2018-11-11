/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class OutPutContestMatches {
    public static String findContestMatch(int n) {
        
        /* its working but problem with ","
        String[]arr = new String [n];
        for(int i = 0 ; i < n / 2; i++){
            arr[i] = "(" + (i + 1) + "," + (n - i ) + ")";
            //System.out.println(arr[i]);
        }
        String str = "";
        for(int i = 0; i < arr.length / 2; i++){
            str += arr[i] + ",";
            System.out.println("(" + str + ")");
        }
        return "(" + str + ")";
*/
         /* Not efficient 
        String[]arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = String.valueOf(i + 1);
            System.out.println(arr[i]);
        }
        int left = 0;
        int right = n - 1;
        while(left < right){
            while(left < right){
                arr[left] = "(" + arr[left] + "," + arr[right] + ")";
                System.out.println("left is :" +arr[left]);
                left++;
                right--;
            }
            left = 0;
        }
        return arr[0];
        */
         String[]arr = new String[n];
         for(int i = 0; i < n; i++){
             arr[i] = String.valueOf(i + 1);
             
         }
         while(n > 1){
             for(int i = 0; i < n /2; i++){
                 arr[i] = "(" + arr[i] + "," + arr[n - 1 -i] +")";
             }
             n /= 2;
         }
         return arr[0];
    }
    public static void main(String[]args){
        System.out.println(findContestMatch(8));
    }
}
