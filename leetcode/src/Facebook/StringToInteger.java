/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 * The function first discards as many whitespace characters as necessary 
 * until the first non-whitespace character is found. Then, starting from this character, 
 * takes an optional initial plus or minus sign followed by as many numerical digits as possible, 
 * and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, 
* which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number,
* or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. 
* If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */
public class StringToInteger {
    public static int myAtoi(String str){
        if(str == null || str.length() == 0){
            return 0;
        }
        str = str.trim();
        int sign = 1;
        int i = 0;

        if(str.charAt(i) == '+'){
            i++;
        } else if(str.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        long num = 0;
         for(; i < str.length(); i++){
             if(str.charAt(i) < '0' ||
                     str.charAt(i) > '9'){
                 break;
             }
             num = num * 10 + (str.charAt(i) - '0');
             if(num > Integer.MAX_VALUE){
                 break;
             }
         }
         if(num * sign >= Integer.MAX_VALUE){
             return Integer.MAX_VALUE;
         }
         if(num * sign <= Integer.MIN_VALUE){
             return Integer.MIN_VALUE;
         }
                
           
        
        
        return (int)num * sign;
    }
    public static void main(String[]args){
        String n = "42";
        System.out.println(myAtoi(n));
    }
    
}
