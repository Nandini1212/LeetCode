/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

/**
 *
 * @author nandini
 */
public class Perimeter {
    
    /*
    public static int countNeighbours(int [][] matrix, int i, int j){
        int count = 0;
        if(i < 0 || i > matrix.length || j < 0 || j > matrix[0].length){
            return -1;
        } 

        if(i > 0 && matrix[i - 1][j] == 1){
        count++;
        }
         if(j > 0 && matrix[i][j - 1] == 1){
        count++;
        }
         
          if(i < matrix.length - 1 && matrix[i + 1][j] == 1){
        count++;
        }
           if(j < matrix[0].length - 1 && matrix[i][j + 1] == 1){
        count++;
        }
           
        return count;
    }
    public static int calculatePerimeter(int[][]matrix){
        if(matrix.length == 0){
            return -1;
        }
        int perimeter = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j  = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    perimeter += (4 - countNeighbours(matrix, i, j));
                }
            }
        }
        return perimeter;
    }*/
    
    public static boolean isVAlidPosition(int row,int col, int rows, int cols){
            if(row >= 0 && row<rows && col >= 0 && col<cols)
                return true;
            return false;
    }
    public static int getPeri(int rows, int Cols){
        int peri = 0;

        for (int i = 0; i<rows;i++){
            for(int j=0; j<Cols ;j++){
                int currentPeri = 0;

                if(!isVAlidPosition(i-1,j,rows,Cols)) // checking on left
                    currentPeri += 1;

                if(!isVAlidPosition(i,j-1,rows,Cols)) // checking on top
                    currentPeri += 1;

                if(!isVAlidPosition(i,j+1,rows,Cols)) // checking on right
                    currentPeri += 1;

                if(!isVAlidPosition(i+1,j,rows,Cols)) // checking on bottom
                    currentPeri += 1;

                peri += currentPeri;
            }
        }
        return peri;
    }
    public static void main(String[]args){
        //int [][] matrix = {{0, 1, 0, 0, 0}, {1, 1, 1, 0, 0}, {1, 0, 0, 0, 0}};
        System.out.println(getPeri(3,2));
        
    }
}
