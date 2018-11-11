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
public class FirstMissingPositive {

    public static int firstMissingPositive(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        }
        int k = partition(A) + 1;
        int temp = 0;
        int firstMissing = 0;
        for(int i = 0; i < k; i++){
            temp = Math.abs(A[i]);
            if(temp <= k){
                if(A[temp - 1] < 0){
                    A[temp - 1] = A[temp - 1];
                } else {
                    A[temp - 1] = -A[temp - 1];
                }
            }
        }
        for(int i = 0; i < k; i++){
            if(A[i] > 0){
                firstMissing = i;
                break;
            }
        }
        return firstMissing + 1;
    }

    public static int partition(int[] arr) {
        int q = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                q++;
                int temp = arr[i];
                arr[i] = arr[q];
                arr[q] = temp;
            }
        }
        return q;
    }
    public  static int  firstMissingPositives( int [] A) { 
        if (A == null || A.length == 0) {
            return 1;
        }
        for(int i = 0; i < A.length; i++){
            int temp = A[i];
            if(temp <= A.length && temp > 0 && A[temp - 1] != temp){
                int t = A[temp - 1];
                A[temp - 1] = temp;
                temp = t;
                i--;
            }
                
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] != i + 1){
                return i + 1;
            }
        }
        return A.length + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        int[] arr1 = {3, 4, -1, 1};
        int[] arr2 = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(arr));
        System.out.println(firstMissingPositive(arr1));
        System.out.println(firstMissingPositive(arr2));
    }
}
