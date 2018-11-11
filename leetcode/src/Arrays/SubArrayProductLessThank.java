/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/*Equivalent to a sliding window solution, maintaining a sliding window 
window with a digital product just less than k, 
using the variable left to record the position of its left boundary, 
the right boundary i is the current traversal position.
Traverse the original array, multiply the current traversed number with prod,
and then perform a while loop. If prod is greater than or equal to k, 
the left edge of the sliding window needs to be moved one bit to the right, 
and the leftmost digit is deleted, so one less digit is missing. 
The product will change, so divide prod by the leftmost digit, 
then shift left to the right, that is, left increments by 1. 
When we determine the size of the window, 
we can count the number of subarrays, which is the size of the window.
For example, for example, in [5 2 6] this window, k is still 100, 
and the right border just slips to the position of 6.
The size of this window is the number of sub-array products containing 6 
less than k, ie [6], [2 6], [5 2 6], exactly three. 
So each time the window adds a number to the right, 
and then the left side removes the number that needs to be removed,
the size of the window is the number of new sub-arrays,
each time added to the result res, see the code as follows:
 */
public class SubArrayProductLessThank {
    public static int numSubarrayProductLessThank(int[]nums, int k){
        if(k <= 1){
            return 0;
        }
        int result = 0;
        int product = 1;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
            while(product >= k){
                product /= nums[j];
                j++;
            }
            result += i - j + 1;
        }
        return result;

    }
    public static void main(String[]args){
        int[]num = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThank(num, 100));
    }
}
