/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[]output = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            output[i] = product;
            product *= nums[i];
        }
        product = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            output[i] *= product;
            product *= nums[i];
        }
        return output;
    }
    public static void main(String[]args){
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
