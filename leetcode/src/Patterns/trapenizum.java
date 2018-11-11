/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

/**
 *
 * @author nandini
 */
public class trapenizum {
    public static void trapeziumPatternPrint(int num){
        int endNum = 0;

        if(num == 0)
            return;

        for(int i=1;i<=num;i++){
            endNum += (i*2);
        }

        int counter = num;
        for(int startIndex=1, line=0, endIndex=endNum; counter >= 1; counter -= 1, line+=1){

            int numOfDash = line*2;
            for(int i=0;i<numOfDash;i++){
                System.out.print("-");
            }

            for(int i=0; i<counter; i++, startIndex+=1){
                System.out.print(startIndex+"*");
            }

            for(int i=endIndex-counter+1; i<=endIndex; i++){
                System.out.print(i);
                if(i<endIndex)
                    System.out.print("*");
            }

            endIndex -= counter;
            System.out.println();
        }
    }
    
    
}
