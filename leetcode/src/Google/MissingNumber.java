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
public class MissingNumber {
    public static int missingNumber(int [] nums){
        int n = nums.length;
        int x1 = nums[0]; 
		int x2 = 1; 
		
		/* For xor of all the elements 
		in array */
		for (int i = 1; i < n; i++){
			x1 = x1 ^ nums[i];
                }
				
		/* For xor of all the elements 
		from 1 to n+1 */		
		for (int i = 2; i <= n+1; i++){
			x2 = x2 ^ i;		
                }
		
		return (x1 ^ x2);
    }
    
    /*
    public static int missingNumber(int [] nums){
        int n = nums.length;
        int sumOfNumbers = n * (n + 1) / 2;
        int sumOfAllNumbers = 0;
        for(int index = 0; index < nums.length; index++) {
            sumOfAllNumbers+=nums[index];
            
        }
        int missingNumber = sumOfAllNumbers - sumOfNumbers ;
        return missingNumber;
        
    }*/
    public static void main(String args[]){
        int [] arr ={1,2,3,5,6,7,8};
        System.out.println(missingNumber(arr));
    }
    
}
