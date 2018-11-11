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
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[]flowers, int n){
        if(flowers.length == 0 ||flowers == null){
            return false;
        }
        int right = 0;
        int left = 0;
        int count = 0;
        for(int i = 0; i < flowers.length; i++){
            if(flowers[i] == 0){
                if(i == flowers.length - 1){
                    right = 0;
                } else {
                    right = flowers[i + 1];
                }
                if(i == 0){
                    left = 0;
                } else {
                    left = flowers[i - 1];
                }
                if(left == right && right == 0){
                    flowers[i] = 1;
                    count++;
                }
            }
            
        }
        if(count >= n){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        int[]arr = {0,0,1,0,1};
        System.out.println(canPlaceFlowers(arr, 1));
    }
}
