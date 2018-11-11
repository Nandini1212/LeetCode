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
public class NumberTriangle {

        public static void numberTriangle(int num) {
            for(int index = 0; index <= num; index++) {
                for(int space = 1; space <= index; space++) {
                    System.out.print(index+ " ");
                }
                System.out.println();
            }
        }
        public static void main(String args[]) {
            int num = 6;
            numberTriangle(num);
        }
    
}
