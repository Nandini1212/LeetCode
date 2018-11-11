/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionHw2Part1;

/**
 *
 * @author nandini
 */
public class CheckIfSumPossible {
  static boolean check(int start, int n, long[] arr, long  remaining, 
	boolean at_lest_one_included)
{	

	if (start >= n)
        {
		return remaining == 0 && at_lest_one_included;
	}
	/*
	We are not including current element. So at_lest_one_included will be dependent on previous 
	elements. 
	*/
	if (check(start + 1, n, arr, remaining, at_lest_one_included))
	{
		return true;
	}
	/*
	Include the current element. Now we have included at least one element so 
	at_lest_one_included should be true. 
	*/
	return check(start + 1, n, arr, remaining - arr[start], true);
}

static boolean check_if_sum_possible(long[] arr, long k)
{
	return check(0, arr.length, arr, k, false);
}
public static void main(String[]args){
    long []arr ={2,4,8};
   System.out.println( check_if_sum_possible(arr, 6));
}
}
