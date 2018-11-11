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
public class GuessNumber {
    public static int guessNumber(int n){
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int result = guess(mid);
            if(result == 0){
                return mid;
            } else if(result == 1){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
