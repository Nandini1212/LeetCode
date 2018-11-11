/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September5th2018;

/**
 *
 * @author nandini
 */
public class IntegerToRoman {
    public static String intToRoman(int num) {
        String[] str = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] val = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         
        StringBuilder sb = new StringBuilder();
         
        for (int i = 0; i < val.length; i++) {
            while (num >= val[i]) {
                System.out.println("num : "+ num + " "+"val[i] :" + val[i]);
                num -= val[i];
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        int s = 25;
        System.out.println(intToRoman(s));
    }
}
