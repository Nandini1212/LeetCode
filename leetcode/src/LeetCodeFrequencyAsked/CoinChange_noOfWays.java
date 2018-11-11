/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

/**
 *
 * @author nandini
 * 
 * 
 * For every coin we have 2 options, either we include it or exclude it 
 * so if we think in terms of binary, its 0(exclude) or 1(include). 
 * so for example if we have 2 coins, options will be 00, 01, 10, 11. so its 2^2. for n coins ,
 * it will be 2^n. 
 * In all these options we will be checking whether that selection has made the change which is required.

But if we notice that we are solving many sub-problems repeatedly.

We can do better by applying Dynamic programming.

Dynamic Programming: Bottom-up –



Create a solution matrix. (solution[coins+1][amount+1]).

Base Cases:

if amount=0 then just return empty set to make the change, so 1 way to make the change.
if no coins given, 0 ways to change the amount.
Rest of the cases:

For every coin we have an option to include it in solution or exclude it.
check if the coin value is less than or equal to the amount needed, 
* if yes then we will find ways by including that coin and excluding that coin.
Include the coin: reduce the amount by coin value and use the sub problem solution (amount-v[i]).
Exclude the coin: solution for the same amount without considering that coin.
If coin value is greater than the amount then we can’t consider that coin, 
* so solution will be without considering that coin.

 * //no.of ways to make the amount
 *  Write a function to compute the number of combinations that make up that amount.
 */
public class CoinChange_noOfWays{
    public static int coinChange(int[] coins, int amount) {
        int [][]solution = new int[coins.length + 1][amount + 1];
        
        //for there is no amount i.e., we simply return empty set. there is one way
        //to make change
        for(int i = 0; i <= coins.length; i++){
            solution[i][0] = 1;
        }
        //there is no coins given
        for(int i = 1; i <= amount; i++){
            solution[0][i] = 0;
        }
        for(int i = 1; i <= coins.length; i++){
            for(int j = 1; j <= amount; j++){
                if(coins[i - 1] <= j){
                    solution[i][j] = solution[i - 1][j] 
                                   + solution[i][j - coins[i - 1]];
                } else {
                    solution[i][j] = solution[i - 1][j];
                }
            }
        }
        return solution[coins.length][amount];
        
    }
    public static void main(String[]args){
        int [] nums = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(nums,amount));
    }
}

