/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.util.LinkedList;
import java.util.Queue;

/**
http://www.zrzahid.com/serialize-and-deserialize-binary-tree/
 */
class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int item) {
        value = item;
    }
}

public class SerializeAndDeserialize {

    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("null").append(",");
        } else {
        
        sb.append(root.value);
        sb.append(",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        }

        return sb.toString();
    }
    
    public static TreeNode deserialize(String data) {
        String[]temp = data.split(",");
        return deserializeHelper(temp, new int[]{0});
        
    }
    public static TreeNode deserializeHelper(String []data, int[]index) {
        if(index[0] > data.length || data[index[0]].equals("null")){
            index[0]++;
            return null;
        } 
        TreeNode root = new TreeNode(Integer.parseInt(data[index[0]++]));
        root.left = deserializeHelper(data, index);
        root.right = deserializeHelper(data, index);
        return root;
    }
    //O(n)
    public static TreeNode desetialezer(String data){
        if(data == null || data.isEmpty() || data.startsWith("null")){
            return null;
        }
        
        String[] splitData = data.split(",");
        
        TreeNode root = new TreeNode(0);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        TreeNode temp = null;
        int i = 0;
        while(!queue.isEmpty()){
            temp = queue.poll();
            temp.value = Integer.parseInt(splitData[temp.value]);
            
            int left = i + 1;
            int right = i + 2;
            
            if(left < splitData.length - 1 && !splitData[left].equals("null")){
                TreeNode leftNode = new TreeNode(left);
                temp.left = leftNode;
                queue.add(leftNode);
            }
            
            if(right < splitData.length - 1 && !splitData[right].equals("null")){
                TreeNode rightNode = new TreeNode(right);
                temp.right = rightNode;
                queue.add(rightNode);
            }
            i += 2;
        }
        return root;
    }

    public static void main(String[] args) {

        TreeNode rootNode = new TreeNode(10);
        rootNode.left = new TreeNode(5);
        rootNode.left.left = new TreeNode(3);
        
        rootNode.left.right = new TreeNode(8);
        rootNode.left.right.left = new TreeNode(7);
        rootNode.right = new TreeNode(20);
        
        
        String str = serialize(rootNode);
        System.out.println(str);
        
        System.out.println(deserialize(str));
        
      
    }
}
