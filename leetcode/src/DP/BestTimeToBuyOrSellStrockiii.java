/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

/**
 *
 * @author nandini
 */
public class BestTimeToBuyOrSellStrockiii {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[prices.length - 1];
        int [] dpMin = new int[prices.length];
        int [] dpMax = new int[prices.length];
        int maximum = 0;
        if(prices == null || prices.length < 2){
            return 0;
        }
        for(int i = 1; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                System.out.println("min :" + min);
            }
            dpMin[i] = Math.max(dpMin[i - 1], prices[i] - min);
        }
        
        for(int i = prices.length - 2; i > -1; i--){
            if(prices[i] > max){
                max = prices[i];
                System.out.println("max :" + max);
            }
            dpMax[i] = Math.max(dpMax[i + 1], max - prices[i]);
        }
        
        for(int i = 0; i < prices.length; i++){
            maximum = Math.max(maximum, dpMin[i] + dpMax[i]);
        }
        return maximum;
    }
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5};
        System.out.println(maxProfit(arr));
    }
    
}
