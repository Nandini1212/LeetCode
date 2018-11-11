/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author nandini
 */
public class MultiArrayPermutation {
    public static void main(String[] args) {
		solveMultiPerms2();
	}
	
	public static void solveMultiPerms2() {
		String[][] sets = new String[][] { 
				{ "quick", "slow" },
				{ "brown", "red" }, 
				{ "fox", "dog" } 
				};
					
		List<List<String>> r = new ArrayList<List<String>>();
		backtrack(r, sets, new LinkedList<String>(), 0);
		
		printLists(r);
	}

	private static void printLists(List<List<String>> r) {
		for (List<String> list : r) {
			for (String string : list) {
				System.out.print(string + " ");
			}
			System.out.println();
		}		
	}

	private static void backtrack(List<List<String>> strs, String[][] sets, LinkedList<String> list, int start) {
		if (start == sets.length) {
			strs.add(new ArrayList<>(list));
		} else if (start < sets.length) {
			for (int i = 0; i < sets[start].length; i++) {
				list.addLast(sets[start][i]);				
				backtrack(strs, sets, list, start + 1);
				list.removeLast();								
			}						
		}		
	}
}
