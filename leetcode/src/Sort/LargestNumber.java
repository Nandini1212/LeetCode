/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author nandini
 */
public class LargestNumber {
    public static String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        String[]arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
            System.out.println("arr is :" + Arrays.toString(arr));
        }
        Comparator<String> myComapre = new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        };
        Arrays.sort(arr, myComapre);
        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }        
        return sb.toString();
    }
    public static void main(String[]args){
        int[]arr = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr));
    }
}
