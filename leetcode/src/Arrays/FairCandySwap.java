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
 */
public class FairCandySwap {
    public static int[]fairCandySwap(int[]a, int[]b){
        Arrays.sort(a);
        Arrays.sort(b);
        int sumA = 0;
        int sumB = 0;
        
        for(int i = 0; i < a.length; i++){
            sumA += a[i];
        }
        for(int i = 0; i < b.length; i++){
            sumB += b[i];
        }
        
        int diff = (sumA - sumB) / 2;
        
        int i = 0;
        int j = 0;
        while(i < a.length || j < b.length){
            if(a[i] - b[j] < diff){
                i++;
            } else if(a[i] - b[j] > diff){
                j++;
            } else {
                break;
            }
        }
        return new int[]{a[i], b[j]};
    }
    public static void main(String[]args){
        int[]a = {1,1};
        int[]b = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(a, b)));
    }
}
