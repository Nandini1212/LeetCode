/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class GrayCode {
    public static List<Integer>grayCode(int n){
        List<Integer>list = new ArrayList<Integer>();
        list.add(0);
        for(int i = 0; i < n; i++){
            int prefix = 1 << i; // 1 << x = 2^x
            System.out.println("prefix : " + prefix);
            for(int j = list.size() - 1; j >= 0; j--){
                System.out.println("size :" + list.size());
                list.add(prefix + list.get(j));
            }
        }
        return list;
    }
    public static void main(String[]args){
     System.out.println(grayCode(2));   
    }
}
