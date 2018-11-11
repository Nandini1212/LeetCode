/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class MinimumTotalInATriangle {
        public static int minimumTotal(List<List<Integer>> triangle) {
            int [] dp = new int[triangle.size() + 1];
            for(int i = triangle.size() - 1; i >= 0; i--){
                for(int j = 0; j < triangle.get(i).size(); j++){
                    System.out.println(triangle.get(i).size() +" "+triangle.get(i));
                    dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
                    System.out.println(triangle.get(i).get(j) +"min is :"+ Math.min(dp[j], dp[j + 1]));
                }
            }
            return dp[0];
        }
        public static void main(String[]args){
            List<Integer>list = new ArrayList<Integer>();
            List<Integer>list1 = new ArrayList<Integer>();
            List<Integer>list2 = new ArrayList<Integer>();
            List<Integer>list3 = new ArrayList<Integer>();
            List<List<Integer>>lis = new ArrayList<List<Integer>>();

            list.add(2);
            lis.add(list);
            list1.add(3);
            list1.add(4);
            lis.add(list1);
            list2.add(6);
            list2.add(5);
            list2.add(7);
            lis.add(list2);
            list3.add(4);
            list3.add(1);
            list3.add(8);
            list3.add(3);
            lis.add(list3);
            System.out.println(minimumTotal(lis));
        }

}
