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
public class DeleteAlternativeCharacters {
    
    public static String deleteAlternate(String str) {
        char [] stringToChar = str.toCharArray();
        String result = "";
        int len = str.length() - 1;
        int count = 1;
        for (int index = 0; index <= len; index++) {
                if(stringToChar[index] == 'a') {
                    count += 1;
                   if(count % 2 == 0) {
                    result += stringToChar[index];
                    System.out.println(count);
                   }
 
                } else {
                    result += stringToChar[index];
                }

        }
        return result;
        
    }
    /*
    public static String deleteAlternate(String str) {
        boolean count = false;
        String output = "";
        char [] charac = str.toCharArray();
        for(int index = 0; index < str.length() - 1; index++) {
            if(charac[index] == 'a') {
                count = !count;
                System.out.println(count);
                if(count) {
                    output+=charac[index];
                    System.out.println(output);
                }
            } else {
                output += charac[index];
                System.out.println(output);
            }
        }
        return output;        
    }*/
    public static void main(String[] args) {
        String str = "abacadaeaf";
        System.out.println(str);
        String result = deleteAlternate(str);
        System.out.println(result);
    }
    
}
