/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author nandini
 */
public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(isBadversion(mid)){
                end = mid;
            } else {
                start = mid;
            }
        }
        if(isBadVersion(start)){
            return start;
        }
        return end;
    }
}
