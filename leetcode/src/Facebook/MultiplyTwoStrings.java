/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 * In this example, our order of operations is to multiply 5 by 1, 2, 3 respectively; then multiply 4 by 1, 2, 3. respectively. 
 * For each multiplication of the alignment, we default to get a two-digit number ( The first digit can be 0)
If the two bits of the multiplication operation are i and j in the respective strings, 
* the corresponding position of the generated two-digit number in the result string res should be i+j and i+j+1.
Add the multiplication result to the existing number at the corresponding position,
* and then place the result in the corresponding position.

 */
public class MultiplyTwoStrings {
    public static String multiply(String num1, String num2){
        int len1 = num1.length();
        int len2 = num2.length();
        int [] position = new int[len1+len2];
        for(int i = len1 - 1; i >= 0; i--){
            for(int j = len2 - 1; j >= 0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int pos1 = i + j;
                int pos2 = i + j + 1;
                int sum = mul + position[pos2];
                position[pos1] += sum / 10;
                position[pos2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int p : position){
            if(!(sb.length() == 0 && p == 0)){
                sb.append(p);
            }
        }
        if(sb.length() == 0){
            return "0";
        }
        return sb.toString();
    }
    public static void main(String[]args){
        String num1 ="123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }
    
}
