/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

import java.util.Vector;

/**
 *
 * @author nandini
 */
class TreNode
        {
            Vector<TreNode> vec = new Vector<TreNode>(0);
            TreNode()
            {
                children.clear();
            }
        };
public class HeightOfKArrTree {
    static int find_height(TreeNode root) {
        if(root == null) return -1;
        int maxH = 0;
        Vector<TreeNode> children = root.children;
        if(children != null) {
            for(TreeNode n: children) {
                int h = find_height(n);
                if(h > maxH) maxH = h;
            }
        } else {
            return maxH;
        }
        return 1 + maxH;
    }
    
}
