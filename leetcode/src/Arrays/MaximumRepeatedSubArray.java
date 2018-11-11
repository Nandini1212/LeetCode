/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author nandini
 * 
 * we can use dp 
 * time : O(n^2) 
 * space : O(n)
 * The following solution uses only a 1D dp array. This is the answer to some of the quick solutions in the Discus area;
Through my detailed analysis later, I finally found that this solution is designed for the problem of "longest continuous common subsequence". When a discontinuous element is involved, the values ​​in dp[] are all set to 0; One solution above is to solve the problem of discrete subsequences at the same time.
Since this solution can be passed, the initial setup idea for this topic is to find the "longest continuous common subsequence."

---------------------

 */
public class MaximumRepeatedSubArray {
    public static int findLength(int[] A, int[] B) {
        int [] dp = new int [A.length + 1];
        int result = 0;
        int max = 0;
        for(int i = 1; i <= A.length; i++){
            for(int j = B.length; j >= 1; j--){
                if(A[j - 1] == B[i - 1]){
                    dp[j] = dp[j - 1] + 1;
                } else {
                    dp[j] = 0;
                }
                result = Math.max(result, dp[j]);
            }
        }
        return result;
    }
    public static void main(String[]args){
        int [] arr = {1,2,3,2,1};
        int [] arr1 = {3,2,1,4,7};
        System.out.println(findLength(arr, arr1));
    }
}
