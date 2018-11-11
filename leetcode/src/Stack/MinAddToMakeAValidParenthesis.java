/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author nandini
 * Time: O(n), space: O(1).


 */

public class MinAddToMakeAValidParenthesis {

    public static int minAddToMakeValid(String S) {

        int stackCount = 0;
        int count = 0;
        for (int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '('){
                stackCount++;
            } else{
                stackCount--;
            }
            if(stackCount < 0){
                stackCount = 0;
                count++;
            }
        }
        return count + stackCount;
    }
    public static void main(String[]args){
        System.out.println(minAddToMakeValid("())"));
    }
}
