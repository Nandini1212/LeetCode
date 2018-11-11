/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class FriendsOfAppropriateAges {
    
    public static int numFriendRequests(int[] ages) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Arrays.sort(ages);
        int sum = 0;
        int result = 0;
        for(int i = 0; i < ages.length; i++){
            if(map.containsKey(ages[i])){
                result += map.get(ages[i]);
                continue;
            }
            sum = 0;
            for(int j = 0; j < ages.length; j++){
                if(i != j && friendRequestOrNot(ages[i], ages[j])){
                    sum++;
                }
            }
            result += sum;
            map.put(ages[i], sum);
        }
        return result;
    }
    public static boolean friendRequestOrNot(int a, int b){
        if(b <= 0.5 * a + 7){
            return false;
        } else if(b > a){
            return false;
        } else if(b > 100 && a < 100){
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        int []arr = {16,17,18};
        System.out.println(numFriendRequests(arr));
    }
}
