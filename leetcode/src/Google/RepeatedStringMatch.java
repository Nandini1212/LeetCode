/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

/**
 *
 * @author nandini
 * First we ensure that the length of sb is atleast greater than or equal to 
 * second string.otherwise B cannot be a substring of sb. 
 * but if two of the strings are having same length, in this case but starting
 * characters might be different, this will also cause B not found in A. Then we repeat
 * A, so that we can find B in A.
 * So we judge that it is nver possible to find the condition of B is
 * sb.indexOf(B) == -1, to determine whether the length of sb is greater
 * than A.length() + B.length().it means B is not found in A and will return -1.
 * check whether the 1st string is in the second string or not.
 * if the 1st string doesn't contain second string it will return -1. 
 * 
 */
public class RepeatedStringMatch {
    public static int repeatedStringMatch(String A, String B){
        StringBuilder sb = new StringBuilder(A);
        int count = 1;
        while(sb.indexOf(B) == -1){ //if we don't find B in A it will simply return -1.
            if(sb.length() - A.length() > B.length()){
                System.out.println("A len is : "+A.length()
                + " "+ " b len is : " + B.length());
                return -1;
            }
            sb.append(A);
            count++;
        }
        return count;
    }
    public static void main(String [] args){
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a,b));
    }
}
