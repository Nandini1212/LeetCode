/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

/**
 *
 * @author nandini
 */
public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][]dp = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }


/*
public static int uniquePaths(int row, int col) {
        int[] cur = new int[cols];
                
        for(int i=0;i<cols;i++)
            cur[i] = 1;            
        
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++)
                cur[j] = cur[j-1] + cur[j];
        } 
        return cur[cols-1];
    }
*/

public static void main(String[]args){
    System.out.println(uniquePaths(3, 2));
}
}