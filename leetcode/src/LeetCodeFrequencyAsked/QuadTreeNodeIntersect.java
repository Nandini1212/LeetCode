/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

/**
 *
 * @author nandini
 */

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;
    public Node(){
        
    }
    public Node(boolean _val, boolean _isLeaf, Node _topLeft,
                Node _topRight, Node _bottomLeft, Node _bottomRight){
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
}
public class QuadTreeNodeIntersect {
    
        
    public static Node intersect(Node quadTree1, Node quadTree2){
        if (quadTree1.isLeaf==true) {
            if (quadTree1.val==true) 
                return new Node(true, true, null, null, null, null);
            else 
                return quadTree2; 
        }
        else if (quadTree2.isLeaf==true) {
            if (quadTree2.val==true) 
                return new Node(true, true, null, null, null, null);
            else 
                return quadTree1; 
        } else {
            Node res = new Node();
            res.topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
            res.topRight = intersect(quadTree1.topRight, quadTree2.topRight);
            res.bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
            res.bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
               
        
        if (res.topLeft.isLeaf==true && res.topLeft.val==true && res.topRight.isLeaf==true && res.topRight.val==true
               && res.bottomLeft.isLeaf==true && res.bottomLeft.val==true && res.bottomRight.isLeaf==true && res.bottomRight.val==true) {
            
                   res.isLeaf=true;
                   res.val=true;
            }
        
            return res;
        }
    }
    
}
