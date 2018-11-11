/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> path = new ArrayList<>();
        if (matrix.length == 0) return path;
        
        int rowStart = 0, rowEnd = matrix.length-1, colStart = 0, colEnd = matrix[0].length-1;
             
        // Until it reach the spiral center that is rowStart > rowEnd or colStart > colEnd
        while (true) {
            // Right
            for (int j = colStart; j <= colEnd; j++) {
                path.add(matrix[rowStart][j]);
            }
            rowStart++;
            if (rowStart > rowEnd) break;
            
            // Down
            for (int i = rowStart; i <= rowEnd; i++) {
                path.add(matrix[i][colEnd]);
            }
            colEnd--;
            if (colStart > colEnd) break;
            
            // Left
            for (int j = colEnd; j >= colStart; j--) {
                path.add(matrix[rowEnd][j]);
            }
            rowEnd--;
            if (rowStart > rowEnd) break;
            
            // Up
            for (int i = rowEnd; i >= rowStart; i--) {
                path.add(matrix[i][colStart]);
            }
            colStart++;
            if (colStart > colEnd) break;
        }
        
        return path;
    }

}

