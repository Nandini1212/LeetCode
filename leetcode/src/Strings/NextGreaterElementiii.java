/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
I) Traverse the given number from rightmost digit, 
* keep traversing till you find a digit which is smaller than the previously traversed digit. 
* For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9.
* If we do not find such a digit, then output is “Not Possible”.

II) Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. 
* For “534976″, the right side of 4 contains “976”. The smallest digit greater than 4 is 6.

III) Swap the above found two digits, we get 536974 in above example.

IV) Now sort all digits from position next to ‘d’ to the end of number.
* The number that we get after sorting is the output. For above example, 
* we sort digits in bold 536974. We get “536479” which is the next greater number for input 534976.
 */
//O(nlogn)
public class NextGreaterElementiii {
    public static int nextGreaterElement(int n) {
        char[] number = (n + "").toCharArray();
        int i = -1;
        for(i = number.length - 1; i > 0; i--){
            if(number[i] > number[i - 1]){
                break;
            }
        
        }
        if(i == 0){
            return -1;
        }
        int first = i - 1;
        int second = i;
        for(i = number.length - 1; i > first; i--){
            if(number[i] > number[first]){
                char temp = number[i];
                number[i] = number[first];
                number[first] = temp;
                break;
            }

        }
        reverse(number, second);
        
        long val = Long.parseLong(new String(number));
        if(val <= Integer.MAX_VALUE){
            return (int)val;
        }
        return -1;
          
    }
    private static void reverse(char[] a,int i)//reverse the number after the number we have found
    {
        int first = i;
        int last = a.length-1;
        while(first<last)
        {
            char t = a[first];
            a[first] = a[last];
            a[last] = t;
            first ++;
            last --;
        }
    }
    public static void main(String[]args){
        int n = 12;
        System.out.println(nextGreaterElement(n));
    }
}
