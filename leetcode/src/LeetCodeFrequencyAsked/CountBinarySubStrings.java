/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

/**
 *
 * @author nandini
 * i am taking variables current and prev for 1 and 0. 
 * iterate through the 1st index of the string. if current and prev index 
 * values are same, increment current. Otherwise assign curr to prev and reset current. 
 * if prev is greater than or equal to current then increment result value.
 */
public class CountBinarySubStrings {
    public static int countBinaryStrings(String s){
        int curr = 1;
        int result = 0;
        int prev = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                curr++;
            } else {
                prev = curr;
                curr = 1;
            }
            if(prev >= curr){
            result++;
            }
        }
        
        return result;
    }
    public static void main(String [] args){
        String s = "00110011";
        System.out.println(countBinaryStrings(s));
    }
    
}
