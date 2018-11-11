/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

/**
 *
 * @author nandini
 */
public class WordsTyping {
    public static int wordsTyping(String[] sentence, int rows, int cols) {
         String s= String.join(" ", sentence)+" ";
         System.out.println("join :" + s);
        int i=0, n=s.length();
        for (int r=0; r<rows; r++){
            i+=cols;
            while (i>-1 && s.charAt(i%n)!=' '){
                i--;
            }
            i++;
        }
        return i/n;
    }
    public static void main(String[]args){
        String [] s = {"I", "had", "apple", "pie"};
        System.out.println(wordsTyping(s, 4, 5));
    }
    
}
