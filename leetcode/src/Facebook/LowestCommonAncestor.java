/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;


/**
 *
 * @author nandini
 * time complexity : O(n)
 */
class Bt{
    int value;
    Bt left;
    Bt right;
    Bt(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class LowestCommonAncestor {
    /*
    check root node first
    then check nodes are equal on left subtree until we hit the null
    if they are equal return that node
    if they are not equal go to right subtree until we hit null or equal
    and go to right subtree
    
    */
    //time complexity is O(n)
     public static Bt lowestCommonAncestor(Bt root, Bt p, Bt q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        Bt left = lowestCommonAncestor(root.left, p, q);
        Bt right = lowestCommonAncestor(root.right, p, q);
        
        if(left == null && right == null){
            return null;
        }
        if(left != null && right != null){
            return root;
        } 

        else if(left == null && right != null){
            
            return right;
        }
        return left;
    }
     
    //time complexity : O(h) space complexity : O(h)
    /*
     static Bt findLCA(Bt root, int n1, int n2) {
         if(root == null){
             return null;
         }
         if(root.value > n1 && root.value > n2){
             return findLCA(root.left, n1, n2);
         }
         if(root.value < n1 && root.value < n2){
             return findLCA(root.right, n1, n2);
         }
         return root;
     }*/
    //for this one time complexity is O(n) and no space complexity
     /*
    static Bt findLCA(Bt root, int n1, int n2){
        while(root != null){
            if(root.value < n1 && root.value < n2){
                root = root.right;
            } else if(root.value > n1 && root.value > n2){
                root = root.left;
            } else {
                    break;
            }
        }
        return root;
    }*/
     public static void main(String[]args){

        Bt root = new Bt(20);
        root.left = new Bt(8);
        root.right = new Bt(22);
        root.left.left = new Bt(4);
        root.left.right = new Bt(12);
        root.left.right.left = new Bt(10);
        root.left.right.right = new Bt(14);
  
       
       // lowestCommonAncestor(root, n1, n2);
        //System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.value);
  
     }
}
