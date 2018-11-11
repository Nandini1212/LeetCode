/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September19th2018;

/*

 */
class TreeNod {
      int val;
      TreeNod left;
      TreeNod right;
      TreeNod(int x) { val = x; }
 }
public class String2BinaryTree {
    private int i = 0;
    public TreeNod str2tree(String s) {
        if (i == s.length()) {
            return null;
        }
        int j = i;
        while (j < s.length() && s.charAt(j) != '(' && s.charAt(j) != ')') {
            j++;
        }
        TreeNod result = new TreeNod(Integer.valueOf(s.substring(i, j)));
        i = j;
        if (i < s.length() && s.charAt(i) == '(') {
            i++;
            System.out.println(i);
            result.left = str2tree(s);
            i++;
        }
        if (i < s.length() && s.charAt(i) == '(') {
            i++;
            System.out.println("right :" + i);
            result.right = str2tree(s);
            i++;
        }
        return result;
    }
    public static void main(String[]args){
        String s = "4(2(3)(1))(6(5))";
        String2BinaryTree str = new String2BinaryTree();
        TreeNod m = str.str2tree(s);
        System.out.println(m.toString());
    }
}
