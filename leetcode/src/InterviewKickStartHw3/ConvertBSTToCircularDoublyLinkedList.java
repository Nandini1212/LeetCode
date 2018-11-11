/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

/**
 *
 * @author nandini
 * https://www.geeksforgeeks.org/convert-a-binary-tree-to-a-circular-doubly-link-list/
 * 
 * time complexity :
 */
class Bscdl{
    int value;
    Bscdl left;
    Bscdl right;
    Bscdl(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class ConvertBSTToCircularDoublyLinkedList {
   
   Bscdl root;
    public ConvertBSTToCircularDoublyLinkedList()
    {
        root = null;
    }
 
    //this is for converting a bst to dll 
    static Bscdl bstToDll(Bscdl root){
        if(root == null){
            return null;
        }
        //convert left and right subtrees to dll
        Bscdl left = bstToDll(root.left);
        Bscdl right = bstToDll(root.right);
        //now make root is another DLL
        root.left = root.right = root;
        //Bscdl firstList = concatenate(left, right);
        Bscdl head = concatenate(concatenate(left, root),right);
        return head;
    }
    static Bscdl concatenate(Bscdl leftList, Bscdl rightList){
        if(leftList == null){
            return rightList;
        }
        if(rightList == null){
            return leftList;
        }
        //store left and right lists last nodes
        Bscdl leftLast = leftList.left;
        Bscdl rightLast = rightList.right;
        
        leftLast.right = rightList; // connect leftlast node to right 
        //first node
        rightList.left = leftLast;
        leftList.left = rightLast;
        rightLast.right = leftList;
        
        return leftList;
    }
    
    static void BSTtoLL(Bscdl root) {
        if(root == null){
            return;
        }        
        bstToDll(root);     
        
    }
    public static void display(Bscdl head)
    {
        System.out.println("Circular Linked List is :");
        Bscdl itr = head;
        do
        {
            System.out.print(itr.value+ " " );
            itr = itr.right;
        }
        while (itr != head);
        System.out.println();
    }


public static void main(String args[])
    {
        // Build the tree
        ConvertBSTToCircularDoublyLinkedList tree = new ConvertBSTToCircularDoublyLinkedList();
        tree.root = new Bscdl(10);
        tree.root.left = new Bscdl(12);
        tree.root.right = new Bscdl(15);
        tree.root.left.left = new Bscdl(25);
        tree.root.left.right = new Bscdl(30);
        tree.root.right.left = new Bscdl(36);

        tree.BSTtoLL(tree.root);

        tree.display(tree.root);
       
    }

}
