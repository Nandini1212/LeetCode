/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author nandini
 */
public class ClimbingStairs {
    
    public static int climbStairs(int n) {
        if(n < 2) {
            return n;
        }
        int [] matrix = new int[n];
        matrix [0] = 1;
        matrix [1] = 2;
        for(int index = 2; index < n; index++) {
            matrix[index] = matrix[index - 1] + matrix[index - 2];
            System.out.println("index is :" + index + "1st:" + matrix[index - 1] +"2nd: is "+ matrix[index - 2]+" "+
                    "matrix is :" +matrix[index]);
        }
        System.out.println(matrix[n - 1]);
        return matrix[n - 1];
    }
    
    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }
}
