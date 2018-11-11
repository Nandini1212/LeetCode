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
public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int buy = prices[0];
        int maxProfit = 0;
        for(int index = 1; index < prices.length; index++){
            if(prices[index] < buy){
                buy = prices[index];
            } else {
                maxProfit = Math.max(maxProfit, prices[index] - buy);
            }
                
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        
    }
    
}
