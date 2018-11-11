/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author nandini
 */
public class AddNumbers {
    public static int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        if(num % 9 == 0){
            return 9;
        }
        return num % 9;
    }
    public static void main(String[]args){
        System.out.println(addDigits(18));
    }
 
}
