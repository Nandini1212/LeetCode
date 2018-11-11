/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September19th2018;

/*
There is no need to remove the empty parentheses, otherwise the binary tree corresponding to this string is not unique.

Summarize the law: 
When the left node is empty, the right node is not empty, and the empty parentheses of the left node are reserved. 
When the node is not left empty, the right node is empty, empty parentheses right node can be removed 
when the left and right nodes are empty, two empty brackets should be removed.
*/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class ConvertBinaryTreeToString {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        dfs(t, sb);
        return sb.toString();
    }
    private void dfs(TreeNode cur, StringBuilder sb) {
        if (cur == null) {
            return;
        }

        sb.append(cur.val);

        if (cur.left != null) {
            sb.append('(');
            dfs(cur.left, sb);
            sb.append(')');
        }

        if (cur.right != null) {
            if (cur.left == null) {
                sb.append("()");
            }

            sb.append('(');
            dfs(cur.right, sb);
            sb.append(')');
        }
     
    }

}
