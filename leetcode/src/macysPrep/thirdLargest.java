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
public class thirdLargest {
    
    public static void thirdLargestNum(int [] num) {
        int largest = num[0];
        int secondLargest = num[0];
        int thirdLargest = num[0];
        
        for(int index = 0; index < num.length;  index++) {
            if(largest < num[index]) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num[index];
            } else if(secondLargest < num[index]) {
                    thirdLargest = secondLargest;
                    secondLargest = num[index];
                
            } else if(num[index] > thirdLargest) {
                thirdLargest = num[index];
            }
        }
        System.out.println(thirdLargest);

    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        thirdLargestNum(arr);
    }
}
