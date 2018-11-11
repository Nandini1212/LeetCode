/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;


/**
 *
 * @author nandini
 */
class TreeNodee {
    TreeNodee left;
    TreeNodee right;
    int data;
    TreeNodee(int val){
        data = val;
    }
}
public class GenerateBinarySearchTrees {
    public List<TreeNodee> generatetrees(int n){
        ArrayList<TreeNodee> list = new ArrayList<TreeNodee>();
        if(n == 0){
            return list;
        }
        return generate(1,n);
    }
    public ArrayList<TreeNodee>generate(int start, int end){
        ArrayList<TreeNodee> list = new ArrayList<TreeNodee>();
        if(start > end){
            list.add(null);
            return list;
        }
        for(int i = start; i <= end; i++){
            ArrayList<TreeNodee> left = new ArrayList<TreeNodee>();
            ArrayList<TreeNodee> right = new ArrayList<TreeNodee>();
            left = generate(start, i - 1);
            right = generate(i + 1, end);
            for(TreeNodee l : left){
                for(TreeNodee r : right){
                    TreeNodee root = new TreeNodee(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
            
        }
        return list;
    }
}
