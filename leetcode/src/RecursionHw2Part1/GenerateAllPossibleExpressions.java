/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionHw2Part1;

/**
 *
 * @author nandini
 */

//It just delays + and - giving * and / the opportunity to grab the previous number.
//-current avoids keeping track of whether a + or - is still pending, 
//taking advantage of a - b * c = a + (-b * c)
//* and / have the highest precedence, 
//so they can be executed immediately. 
//If just current would be passed, previous would get dropped.

public class GenerateAllPossibleExpressions {
    static void check(double sum, double previous, String digits, double target, String expr) {
   if (digits.length() == 0) {
     if (sum + previous == target) {
       System.out.println("Sum is : " + sum + " " + expr + " = " + target);
     }
   } else {
     for (int i = 1; i <= digits.length(); i++) {
       double current = Double.parseDouble(digits.substring(0, i));
       String remaining = digits.substring(i);
       //try all given binary operator for evaluation
       check(sum + previous, current, remaining, target, expr + " + " + current);
       check(sum, previous * current, remaining, target, expr + " * " + current);
       check(sum, previous / current, remaining, target, expr + " / " + current);
       check(sum + previous, -current, remaining, target, expr + " - " + current);
     }
   }
 }

 static void f(String digits, double target) {
   for (int i = 1; i <= digits.length(); i++) {
     String current = digits.substring(0, i);
     check(0, Double.parseDouble(current), digits.substring(i), target, current);
   }
 } 
  
 public static void main(String [] args){
     String num = "224";
     f(num, 8);
     
 }
}
