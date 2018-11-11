/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September11th;

/**
 *
 * iterate through a string,
 * if char is not '-' increment count.
 * check if count and key + 1 are same append '-' to string builder.
 * and make it count to 1.
 * if char is '-', make that to upper case and append that character to string builder.
 * make the string builder reverse and return that string.
 */
public class LicenseKeyFormating {
    public static String licenseKeyFormatting(String s, int k){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != '-'){
                count++;
                if(count == k + 1){
                    sb.append('-');
                    count = 1;
            }
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        
        }
    return sb.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",4));
    }

}
