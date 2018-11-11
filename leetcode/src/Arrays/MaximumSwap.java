/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author nandini
 * O(n)
 */
public class MaximumSwap {

    public static int maximumSwap(int num) {

        char[] chars = Integer.toString(num).toCharArray();
        int maxIndex = chars.length - 1;
        int x = 0, y = 0;
        for (int i = chars.length - 2; i >= 0; i--) {
            if (chars[maxIndex] == chars[i]) {
                continue;
            }

            if (chars[maxIndex] < chars[i]) {
                maxIndex = i;
            } else {
                x = maxIndex;
                y = i;
            }
        }

        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;

        return Integer.valueOf(new String(chars));

    }

    public static void main(String[] args) {
        System.out.println(maximumSwap(7019));
    }
}
