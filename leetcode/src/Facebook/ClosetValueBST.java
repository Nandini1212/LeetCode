/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 */
class ree{
    int value;
    ree left;
    ree right;
    ree(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class ClosetValueBST {
    public static int closetValue(ree root, double target){
        if(root == null){
            return 0;
        }
        ree child = null;
        if(root.value < target){
            child = root.right;
        } else {
            child = root.left;
        }
        if(child == null){
           return root.value; 
        }
        int closet = closetValue(child, target);
        double min = Math.abs(root.value - target);
        if(min < Math.abs(closet - target)){
            return root.value;
        } else {
            return closet;
        }
    }
    public static void main(String [] args){
        ree root = new ree(4);
        root.left = new ree(2);
        root.right = new ree(5);
        root.left.left = new ree(1);
        root.left.right = new ree(3);
        System.out.println(closetValue(root, 3.714286));
        
    }
    
}
