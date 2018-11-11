/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September13th2018;

/**
 *
 * @author nandini
 * http://javabypatel.blogspot.com/2016/11/print-matrix-in-spiral-order.html
 */
public class SpiralMatrix {
    static String printSpirally(char[][] matrix) {

        int rowStart=0;
  int rowLength=matrix.length-1;
   
  int colStart=0;
  int colLength = matrix[0].length-1;
  String str = "";
  
   
  while(rowStart <= rowLength && colStart <= colLength){
   
   for (int i = rowStart; i <= colLength; i++) {
    str += matrix[rowStart][i];
   }
 
   for (int j = rowStart+1; j <= rowLength; j++) {
    str += matrix[j][colLength];
   }
    
   if(rowStart+1 <= rowLength){
    for (int k = colLength-1; k >= colStart; k--) {
     str += matrix[rowLength][k];
    }
   }
   if(colStart+1 <= colLength){
    for (int k = rowLength-1; k > rowStart; k--) {
     str += matrix[k][colStart];
    }
   }
    
   rowStart++;
   rowLength--;
   colStart++;
   colLength--;
  }
  return str;
  
    }
}
