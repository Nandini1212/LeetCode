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
public class RotateImage {
    public static void images(int[][]matrix){
        if(matrix == null || matrix.length == 0
           || matrix[0].length == 0){
            return;
        }
        if(matrix.length != matrix[0].length){
            return;
        }
        int [][] temp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                temp[i][j] = matrix[j][i];
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = temp[matrix.length - j - 1][i];
            }
        }
    }
    
    // in place
    public static void image(int[][]matrix){
        int height = matrix.length;
        int weight = matrix[0].length;
        if(height != weight){
            return;
        }
        int temp = 0;
        for(int i = 0; i < height / 2; i++){
            for(int j = i; j < height - 1 - i; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[height - j - 1][i];
                matrix[height - j - 1][i] = matrix[height - i - 1][height - j - 1];
                matrix[height - i - 1][height - j - 1] = matrix[j][height - i - 1];
                matrix[j][height - i - 1] = temp;
                
            }
        }
    }
    public static void main(String[]args){
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        image(matrix);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
