/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 */
public class BuyOrSellStocksii {
    public static int maxProfit(int[] prices){
        int result = 0;
        for(int index = 0; index < prices.length - 1; index++){
            if(prices[index] < prices[index + 1]){
                result += prices[index + 1] - prices[index];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        
    }
    
    
}
