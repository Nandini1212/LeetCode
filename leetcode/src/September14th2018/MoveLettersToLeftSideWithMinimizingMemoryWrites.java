/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September14th2018;

/**
 *
 * @author nandini
 */
public class MoveLettersToLeftSideWithMinimizingMemoryWrites {
    static String move_letters_to_left_side_with_minimizing_memory_writes(String s) {
        /*
         * Write your code here.
         */
         int j = 0;
         char [] ch = s.toCharArray();
         for(int i = 0; i < ch.length; i++){
             if(!Character.isDigit(ch[i])){
                 if(i != j){
                 ch[j] = ch[i];
                 }
                 j++;
             }
             
             
         }
         String newString1 = new String(ch);
         return newString1;

    }
    public static void main(String[]args){
        String s = "12Ab";
        System.out.println(move_letters_to_left_side_with_minimizing_memory_writes(s));
    }

}
