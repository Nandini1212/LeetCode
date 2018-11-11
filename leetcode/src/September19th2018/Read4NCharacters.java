/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September19th2018;

/**
 *
 * @author nandini
 */
public class Read4NCharacters {
    
    public int read(char[] buf, int n) {
        char [] tempBuf = new char[4]; // temp buf for read4 method
        boolean eof = false; // if we meet the end of the file
        int total = 0; // no.of characters read

        while(!eof && total < n){  
            int count = read4(tempBuf); //rad file using read4 method
            if(count < 4){ // if count < 4 that means we reached the end of the file
                eof = true;
            }
            count = Math.min(count, n - total); // actual count of we nee to write to buf or what we can write to buf
            
            //copy from temp buf to buffer
            for(int i = 0; i < count; i++){
                buf[total] = tempBuf[i];
                total++;
            }
        }
        return total;
    }
}
