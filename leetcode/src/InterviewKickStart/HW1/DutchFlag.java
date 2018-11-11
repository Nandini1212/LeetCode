/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class DutchFlag {
    static String dutch_flag_sort(String balls) {
        char[] ball = balls.toCharArray();
       int red = 0;
       int blue = ball.length - 1;
       for(int index = 0; index <= blue; index++) {
           if(red < blue) {
               if(ball[index] == 'r'){
                  char tmp = ball[index];
                    ball[index] = ball[red];
                    ball[red] = tmp;
                    red++;
                }
                else if(ball[index] == 'b'){
                    char tmp = ball[index];
                    ball[index] = ball[blue];
                    ball[blue] = tmp;
                    blue--;
                    index--;
                }
           }               
           
       }
       return new String(ball);
    }

    public static void main(String[]args) {
        String str = "ggbbrr";
        System.out.println(dutch_flag_sort(str));
    }
}


