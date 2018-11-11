/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author nandini
 */
public class lastRemaining {
    /*
    public static int lastRemaining(int n) {
        boolean left = true;
        int remain = n;
        int head = 1;
        int step = 1;
        while (remain > 1) {
            if (left || remain % 2 == 1) {
                head = head + step;
                System.out.println("head is: " + head);
            }
            step *= 2;
            System.out.println("step is: " + step);
            remain /= 2;
            System.out.println("remain is: " + remain);
            left = !left;
            System.out.println(left);
        }
        return head;
    }*/
    /* recursive
    public static int lastRemaining(int n) {
        if (n == 1)
            return 1;
        if (n <= 4)
            return 2;
        if (n % 2 != 0)
            n -= 1;
        if (n % 4 != 0)
            return 4 * lastRemaining(n / 4);
        else
            return 4 * lastRemaining(n / 4) - 2;

    }*/
    public static int lastRemaining(int n) {
        int remain = n;
        boolean left = true;
        int head = 1;
        int step = 1;
        while(remain > 1) {
            if(left || remain % 2 != 0) {
                head = head + step;
            }
            step = step * 2;
            remain = remain / 2;
            left = !left;
        }
          return head;
        
    }
    
    
    public static void main(String[] args) {
        int n = 11;
        System.out.println(lastRemaining(n));
    }

    
}
