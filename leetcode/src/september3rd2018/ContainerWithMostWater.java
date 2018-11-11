/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

/**
 *Initially we can assume the result is 0. Then we scan from both sides.
 * If leftHeight < rightHeight, move left and find a value that is greater than rightHeight.
 * Similarily, if leftHeight > rightHeight, move right and find a value that is greater than leftHeight.
 * Additionally, keep tracking the max value.
 * @author nandini
 */
public class ContainerWithMostWater {
    public static int maxArea(int [] height){
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[]args){
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
