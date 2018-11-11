/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

/**
 *
 * @author nandini
 */

public class ReadNCharactersGivenRead4ii {
    private int charPtr = 0; //pointer for the char array
    private int storeChars = 0; // storing the size of char array
    private char[] arr = new char[4]; // instance for store data from read4
    
    public int read(char[] buf, int n) {
        int count = 0;
        while(count < n){
            if(charPtr == 0){
                storeChars = read4(charPtr); // store file data to char array
            }
            //when no input stream
            if(storeChars == 0){
                break;
            }
            if(charPtr < storeChars){
                buf[count++] = arr[charPtr];
            }
            if(charPtr >= storeChars){ //check if char array need to be updated
                charPtr = 0;
            }
        }
        return count;
    }

}
