/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class SpiralMatrixii {
    public static int[][] generateMatrix(int n){
        int [][] result = new int [n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int k = 1;
        
        while(k <= n * n){
            for(int i=left; i<=right; i++){
            result[top][i]=k;
            k++;
        }    
        top++;
 
        for(int i=top; i<=bottom; i++){
            result[i][right]=k;
            k++;
        }
        right--;
 
        for(int i=right; i>=left; i--){
            result[bottom][i]=k;
            k++;
        }
        bottom--;
 
        for(int i=bottom; i>=top; i--){
            result[i][left] = k;
            k++;
        }
        left++;
    }
 
    return result;
    }
    public static void main(String[]args){
        System.out.println(Arrays.toString(generateMatrix(3)));
    }
}
