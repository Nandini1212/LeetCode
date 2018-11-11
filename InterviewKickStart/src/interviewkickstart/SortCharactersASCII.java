/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewkickstart;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class SortCharactersASCII {

    /**
     * @param args the command line arguments
     * 
     */
    public static String  sortAsciiChar(String str) {
         
        //char [] ch = str.toCharArray();
        int [] count = new int[256];
      
        for(int index = 0; index < str.length(); index++) {
           int ascii = (int)str.charAt(index);
           count[ascii]++;
           //count[ch[index]]++; //for character occurences
            System.out.println(ascii);

            //System.out.println(Arrays.toString(count));
        }
        String  outPut = "";
        for(int index = 0 ;index < count.length; index++) {
            if(count[index] > 0 ) {
                char c = (char)index;
                System.out.println("c is : " + c + "  "+ count[index]);
                for(int k=0; k < count[index]; k++) {
                    outPut+=(char)(c);
                }
            }
        }

     return new String (outPut);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "This is easy";
        System.out.println(sortAsciiChar(str));
    }
    
}
