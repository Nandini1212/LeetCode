/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class MergeTwoArrays {
    //public static int [] merge(int[] a1,  int[] b1) {
        /*int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;*/
        /*another solution which I am not understand
        int i = A.length - 1;
	int j = B.length - 1;
	int k = A.length + B.length - 1;
 
	while (k >= 0) {
		if (j < 0 || (i >= 0 && A[i] > B[j]))
			A[k--] = A[i--];
		else
			A[k--] = B[j--];
	}*/
        /*
         while(m > 0 && n > 0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[m+n-1] = nums1[m-1];
                m--;
            }else{
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
 //remaining elements from second array
 
        while(n > 0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
        return A;*/
        
      static int[] merger_first_into_second(int[] A, int[] B) {
        /*
         * Write your code here.
         */
        int i = A.length - 1;
        System.out.println("len i is :" + i);
	int j = A.length - 1;
        System.out.println("len j is :" + j);
	int k = B.length -  1;
        System.out.println("len k is :" + k);

	while (i >= 0 && i != k) {
		if(A[i] > B[j]) {
                    System.out.println(A[i]);
                    B[k] = A[i];
                    System.out.println(A[i]);
                    i--;
                    k--;
                } else{
                    B[k] = B[j];
                    j--;
                    k--;
                  
                }              

        }
        // one array may not be equal to 0. one array already in position
        //we need to add element one by one
        while(i >=0) {
            B[k] = A[i];
            i--;
            k--;
        }
System.out.println(Arrays.toString(B));
        return B;
      }


    public static void main(String [] args) {
        int nums1[] = {3,1,3,5,6};
        int nums2[] = {2,4,6,0,0,0};
                
         System.out.println(Arrays.toString(merger_first_into_second(nums1, nums2)));
         
         
        
    }
}
