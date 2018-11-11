/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class MountainPeak {
    public static int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        //System.out.println(lo);
        return lo;
    }
        
    
    public static void main(String[] args) {
        int [] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
