/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

/**
 *
 * @author nandini
 */
public class LongestIncreasingPath {
    public static int longestIncreasingPath(int[][] matrix) {
        if(matrix.length <= 0 || matrix[0].length <= 0){
            return 0;
        }
        int max = 0;
        int [][] cache = new int [matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                max = Math.max(max, dfs(matrix, cache, i, j, Integer.MIN_VALUE));
            }
        }
        return max;
    }


    public static int dfs(int[][]matrix, int[][]cache, int r, int c, int min){
        if(r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length){
            return 0;
        }
        if(matrix[r][c] <= min){
            return 0;
        }
        if(cache[r][c] != 0){
            return cache[r][c];
        }
        min = matrix[r][c];
        
        int up = dfs(matrix, cache, r - 1, c, min) + 1;
        int left = dfs(matrix, cache, r, c - 1, min) + 1;
        int right = dfs(matrix, cache, r, c + 1, min) + 1;
        int down = dfs(matrix, cache, r + 1, c, min) + 1;
        cache[r][c] = Math.max(up, Math.max(left, Math.max(right, down)));
        return cache[r][c];

    }    
    public static void main(String[]args){
        int [][] matrix = {{3,4,5},
                            {3,2,6},
                            {2,2,1}};
        System.out.println(longestIncreasingPath(matrix));
    }
}