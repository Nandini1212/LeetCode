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
public class sumArrayMinimums {
      private static final int MOD = 1_000_000_007;
    public static int sumSubarrayMins(int[] A) {
  int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = (sum + countSubarray(A, i) * A[i]) % MOD;
        }
        return sum;
    }

    private static int countSubarray(int[] A, int i) {
        int left = 1, right = 1;
        for (int j = i - 1; j >= 0 && A[j] > A[i]; j--, left++) ;
        for (int j = i + 1; j < A.length && A[j] >= A[i]; j++, right++) ;
        return left * right;
    }
    public static void main(String[]args){
        int[]arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}
