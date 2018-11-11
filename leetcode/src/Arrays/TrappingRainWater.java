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
public class TrappingRainWater {
    public static int trap(int[]height){
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int max = 0;
        while(left <= right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            //leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
            if(leftMax < rightMax){
                max += (leftMax - height[left]);
                left++;
            } else {
                max += (rightMax - height[right]);
                right--;
            }
        }
        return max;
    }
    public static void main(String[]args){
        int[]trap = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(trap));
    }
}
