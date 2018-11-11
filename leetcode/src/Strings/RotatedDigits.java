/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author nandini
 */
public class RotatedDigits {
    public static int rotate(int nums) {
        int count = 0;
        for(int i = 1; i <= nums; i++){
            if(isValid(i)){
              count++;  
            }
        }
        return count;
    }
    
    public static boolean isValid(int num){
        boolean validFound = false;
        while(num > 0){
            if(num % 10 == 2){
                validFound = true;
            }
            if(num % 10 == 5){
                validFound = true;
            }
            if(num % 10 == 6){
                validFound = true;
            }
            if(num % 10 == 9){
                validFound = true;
            }
            if(num % 10 == 3){
                return false;
            }
            if(num % 10 == 4){
                return false;
            }
            if(num % 10 == 7){
                return false;
            }
            num = num / 10;
            
        }
        return validFound;
    }

    public static void main(String[]args){
        System.out.println(rotate(10));
    }
}
