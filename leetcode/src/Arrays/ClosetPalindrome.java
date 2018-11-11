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
public class ClosetPalindrome {
    public String nearestPalindromic(String n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n.length() - 1; i++){
            sb.remove(n.length() - 1);
            sb.append('x');
        }
    }
}
