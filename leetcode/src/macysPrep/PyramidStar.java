/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macysPrep;

/**
 *
 * @author nandini
 */
public class PyramidStar {
    public static void main(String args[]) {
        for(int index = 0; index < 5; index++) {
            for(int space = 0; space < 5 - index; space++) {
                System.out.print(" ");
            }
            for(int star = 0; star < index; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
