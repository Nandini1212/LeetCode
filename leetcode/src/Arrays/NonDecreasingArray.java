/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/*First of all, the topic is clear, but it is easy to make mistakes. 
When you find array[i] > array[i+1]a situation, you need to modify the two, 
either modify array[i]or modify array[i+1], such as: [3,5,2,4], if not modified, then judged to be true, in fact, false;
Specifically, whether to array[i]modify or array[i+1]modify,
you need to judge array[i-1]and array[i+1]the size of the two, in two cases
Case 1: [2, 5, 3, 4], when i=1 array[i]=5, at this time array[i-1]=2 < array[i+1]=3, 
you need to modify “5” to “3”, that is array[i]=array[i+1], to ensure that the array returns true;
Case 2: [4, 5, 3, 7], when i=1 array[i]=5, at this time array[i-1]=4 > array[i+1]=3,
you need to modify “3” to “5”, that is array[i+1]=array[i], to ensure that the array returns true;
count<=1The judgment condition to be added is in the traversal loop, 
and as long as two modifications appear in the array, the exit is exited to avoid unnecessary calculations.

Time complexity: O(n), space complexity: O(1)



 */
public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                count++;
                if(i - 1 < 0 || (nums[i - 1] <= nums[i + 1])){
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return count <= 1;
            
    }
    public static void main(String[]args){
        int []arr = {4,2,3};
        System.out.println(checkPossibility(arr));
    }

}
