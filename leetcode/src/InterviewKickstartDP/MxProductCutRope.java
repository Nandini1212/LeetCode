/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickstartDP;

/**
 * http://codercareer.blogspot.com/2013/12/no-52-maximal-product-when-cutting-rope.html
 *
 * @author nandini
 */
public class MxProductCutRope {
    
    static long max_product_from_cut_pieces(int n) {
        /*
         * Write your code here.
         */
         if(n < 2) {
        return 0;
    }
    if(n == 2) {
        return 1;
    }
    if(n == 3) {
        return 2;
    }

    long[] products = new long[n + 1];
    products[0] = 0;
    products[1] = 1;
    products[2] = 2;
    products[3] = 3;

    for(int i = 4; i <= n; ++i) {
        long max = 0;
        for(int j = 1; j <= i / 2; ++j) {
            long  product = products[j] * products[i - j];
            if(max < product) {
                max = product;
            }

            products[i] = max;
        }
    }

    return products[n];

    }
    
    public static void main(String[]args){
        int n = 4;
        System.out.println(max_product_from_cut_pieces(n));
    }
}
