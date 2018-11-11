/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 * Space complexity should be O(1)
 * taking two variable one is for the current value,
 * another is for number of occurences of that element.
 * then clear the number of occurences of the current value.
 * retraverse the current number of occurences of the candidate value.
 * compare whether the value is greater than n/3 or not
 * The idea is three three deletions, how to describe is the key to 
 * three three deletions is to describe the two counts. 
 */
public class MajorityElementii {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums==null||nums.length==0){
            return result;
        }
        int target1 = nums[0];
        int target2 = 0;
        for(int i = 0 ;i<nums.length;i++ )
        {
            if(nums[i]!=target1)
            {
                target2=nums[i];
                break;
            }
        }
        int count1= 0;
        int count2= 0;
        for(int i = 0;i<nums.length;i++  )
        {
            if(nums[i]==target1)
                count1++;
            else if(nums[i]==target2)
                count2++;
            else
            {
                if(count1==0&&count2==0)
                {
                    target1=nums[i];
                    count1++;
                }  
                else if(count1!=0&&count2==0)
                {
                    target2=nums[i];
                    count2++;
                }
                  else if(count1==0&&count2!=0)
                {
                    target1=nums[i];
                    count1++;
                }
                else
                {
                    count2--;
                    count1--;
                }
            }
        }
        count1= 0;
        count2= 0;
         for(int i = 0;i<nums.length;i++  )
         {
             if(nums[i]==target1)
                 count1++;
             if(nums[i]==target2)
                 count2++;
         }
        if(count1>nums.length/3)
            result.add(target1);
        if(count2>nums.length/3)
        {
            if(target1!=target2)
                 result.add(target2);
        }
        return result;


    }
    public static void main(String [] args){
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
