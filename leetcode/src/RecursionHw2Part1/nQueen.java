/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionHw2Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nandini
 */
public class nQueen {
    
    /*public boolean isValid(int row, int [] columnVal){
39         for(int i = 0; i < row; i++){
40             if(columnVal[row] == columnVal[i]
41                ||Math.abs(columnVal[row]-columnVal[i]) == row-i)
42                return false;
43         }
44         return true;
45     }
    
    
    static boolean isSafe(char board[][], int row, int col)
    {
        int i, j;
 
        /* Check this row on left side 
        for (i = 0; i < col; i++){
            if (board[row][i] == 1)
                return false;
        }
 
        /* Check upper diagonal on left side
        for (i=row, j=col; i>=0 && j>=0; i--, j--){
            if (board[i][j] == 1)
                return false;
        }
 
        /* Check lower diagonal on left side 
        for (i=row, j=col; j>=0 && i<board.length; i++, j--){
            if (board[i][j] == 1)
                return false;
        }
 
        return true;
    }
    
    static boolean solveNQUtil(char board[][], int col,List<List<String>> result){
        //all queens are placed
        if(col == board.length){
            enterInto(result,board);
            return true;
        }
        
        //try placing queens
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, i, col)){
                board[i][col] = '1'; // if it is safe place queen in that position
                if(solveNQUtil(board, col + 1,result) == true) {
                    return true;
                }
                board[i][col] = '0'; //for backtracking 
                
            }
        }
        return false;
    }
    
    
    public static void printSolutionBoard(char board[][]){
        int i, j;
        for(i = 0; i < board.length; i++){
           for(j = 0; j < board.length; j++){
               
               System.out.print(board[i][j]
                                 + " \t");
           }
           System.out.println();
        }
                
    }
    
    private static void enterInto(List<List<String>> result, char [][] matrix) {
        List<String> nestedResult = new ArrayList<String>();
        for (int i = 0; i < matrix.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < matrix.length; j++) {
                sb.append(matrix[i][j]);
            }
            nestedResult.add(sb.toString());
        }
        result.add(nestedResult);
    }
   
    public static List<List<String>> placeQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        char [][] matrix = new char[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = '.';
            }
        }
        solveNQUtil(matrix, 0,result);
        return result;
    }*/
   
  public static List<List<String>> solveNQueens(int n) {
    List<List<String>> res = new ArrayList<List<String>>();
    if (n <= 0) {
        return res;
    }
    int[] visit = new int[n];
    helper(res, n, visit, 0);

    return res;
}
public static void helper(List<List<String>> res, int n, int[] visit, int pos) {
    if (pos == n) {
        List<String> tem = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (visit[i] == j) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            tem.add(sb.toString() + "\n");
        }
        
        res.add(tem);
        return;
    }
    for(int i = 0; i < n; i++) {
        visit[pos] = i;
        if(isValid(visit, pos)) {
            helper(res, n, visit, pos + 1);
        }
    }
}
public static boolean isValid(int[] visit, int pos) {
    for (int i = 0; i < pos; i++) {
        if (visit[i] == visit[pos] || pos - i == Math.abs(visit[pos] - visit[i])) {
            return false;
        }
    }
    return true;
} 


    
    public static void main(String [] args){
       
        int n = 4;
       List<List<String>> solutions = solveNQueens(4);
       System.out.println("size=  "+solutions.size());
       /*
       String [][] arr = new String [solutions.size()][n];
       int index = 0;
       for(List<String> a : solutions){
           arr[index] = a.toArray(new String[n]);
           index++;
       }
       for(int i = 0; i < solutions.size(); i++){
       System.out.println(Arrays.toString(arr[i]));
       }
*/
			
				
        }
       
    }

            
    

