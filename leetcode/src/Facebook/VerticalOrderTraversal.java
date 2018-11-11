/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import com.sun.org.apache.xalan.internal.lib.NodeInfo;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
//import javax.swing.tree.TreeNode;

/**
 *
 * @author nandini
 */

class TNode {
    int value;
    TNode left;
    TNode right;
    TNode(int item){
        value = item;
        left = null;
        right = null;
    }
}

public class VerticalOrderTraversal {
    
    public static List<List<Integer>> verticalOrder(TNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(root==null)
        return result;
 
    // level and list    
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
 
    LinkedList<TNode> queue = new LinkedList<TNode>();
    LinkedList<Integer> level = new LinkedList<Integer>();
 
    queue.offer(root);
    level.offer(0);
 
    int minLevel=0;
    int maxLevel=0;
 
    while(!queue.isEmpty()){
        TNode p = queue.poll();
        int l = level.poll();
 
        //track min and max levels
        minLevel=Math.min(minLevel, l);
        System.out.println("min level is:" + minLevel);
        maxLevel=Math.max(maxLevel, l);
        System.out.println("max level is:" + maxLevel);
 
        if(map.containsKey(l)){
            map.get(l).add(p.value);
            System.out.println("map .get is :" + map.get(l) +","+"level is :" + l);
        }else{
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(p.value);
            System.out.println("list is:" + list.add(p.value) + " " + "p.value is : "+ p.value);
            map.put(l, list);
          
        }
 
        if(p.left!=null){
            queue.offer(p.left);
            level.offer(l-1);
        }
 
        if(p.right!=null){
            queue.offer(p.right);
            level.offer(l+1);
        }
    }
 
 
    for(int i=minLevel; i<=maxLevel; i++){
        if(map.containsKey(i)){
            result.add(map.get(i));
            
        }
    }

    return result;
    
    }
    
    public static void main(String [] args){
        TNode root = new TNode(12);
        root.left = new TNode(6);
        root.right = new TNode(19);
        root.left.right = new TNode(8);
        root.left.left = new TNode(-23);
        root.right.left = new TNode(18);
        root.right.right = new TNode(52);

        System.out.println(verticalOrder(root));

    }
    
}
