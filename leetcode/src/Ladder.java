/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class Ladder{
   

    public static void main(String args[]){
        try {
            System.out.println(doStuff(args));
        }
        catch(Exception e){
            System.out.println("exc");
        }
            doStuff(args);
        
    }
        static int doStuff(String[]args){
            return Integer.parseInt(args[0]);
        }
    }

