/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author nandini
 */
public class FindTheCelebrity {


        public static int MATRIX[][] = {{0, 0, 1, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 0},
        {0, 0, 1, 0}};

        // Returns true if a knows 
        // b, false otherwise 
        static boolean knows(int a, int b) {
            boolean result = false;
            if(MATRIX[a][b] == 1){
                result = true;
            } else {
                result = false;
            }
                  
            return result;
        }

        // Returns -1 if celebrity 
        // is not present. If present, 
        // returns id (value from 0 to n-1). 
        static int findCelebrity(int n) {
            // Initialize two pointers 
            // as two corners 
            int a = 0;
            int b = n - 1;

            // Keep moving while 
            // the two pointers 
            // don't become same. 
            while (a < b) {
                if (knows(a, b)) {
                    a++;
                } else {
                    b--;
                }
            }

            // Check if a is actually 
            // a celebrity or not 
            for (int i = 0; i < n; i++) {
                // If any person doesn't 
                // know 'a' or 'a' doesn't 
                // know any person, return -1 
                if (i != a && (knows(a, i)
                        || !knows(i, a))) {
                    return -1;
                }
            }
            return a;
        }

        public static int findCelebritys(int n) {
            int celeb = 0;
            for (int i = 1; i < n; i++) {
                if (knows(celeb, i)) {
                    celeb = i;
                }
            }
            for (int k = 0; k < n; k++) {
                if (k != celeb && (knows(celeb, k)) || !knows(k, celeb)) {
                    return -1;
                }
            }
            return celeb;
        }

        public static void main(String[] args) {
            int n = 4;
            int result = findCelebrity(n);
            if (result == -1) {
                System.out.println("No Celebrity");
            } else {
                System.out.println("Celebrity ID "
                        + result);
            }
        }
    }
