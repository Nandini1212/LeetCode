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
public class FindDiagonalTraverseMatrix {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = 0;
        int[]arr = new int[m * n];
        if (matrix.length == 0) return new int[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[row][col];
            if ((row + col) % 2 == 0) { // moving up
                if(col == n - 1) { 
                    row++; 
                }
                else if (row == 0){ 
                    col++; 
                }
                else { 
                    row--; 
                    col++; 
                }
            } else {                // moving down
                if(row == m - 1) { 
                    col++; 
                }
                else if (col == 0){ 
                    row++; 
                }
                else{ 
                    row++; 
                    col--; 
                }
            }   
        }   
        return arr;
}
    public static void main(String[]args){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }
}
