/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September5th2018;

/**
 *
 * @author nandini
 */
public class DecodeWays {
     public static int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) == '0'){
            return 0;
        }

        int prev = 0;
        int cur = 1;
        for (int i = 1; i <= s.length(); ++i) {
            if (s.charAt(i-1) == '0'){
                cur = 0;
            }

            if (i < 2 || !(s.charAt(i - 2) == '1' ||
                    (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6'))){
                              
                prev = 0;
            }
                

            int tmp = cur;
            cur = prev + cur;
            prev = tmp;
        }
        return cur;
    }
     public static void main(String [] args){
         String s = "12";
         System.out.println(numDecodings(s));
     }
}
