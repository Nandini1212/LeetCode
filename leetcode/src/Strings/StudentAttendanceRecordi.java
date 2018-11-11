/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author nandini
 */
public class StudentAttendanceRecordi {
    public static boolean checkRecord(String str) {
         int a=0, l=0;
        char[]s = str.toCharArray();
        for(int i=0;i<s.length;i++) {
            if(s[i]=='A'){
                a++;
            }
            if(s[i]=='L'){
                l++;
            }else {
                l=0;
            }
            if(a >= 2 || l > 2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String s = "PPALLP";
        System.out.println(checkRecord(s));
    }
}
