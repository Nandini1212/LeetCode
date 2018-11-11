/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 *
 * @author nandini
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x){
          val = x; 
      }
  }
public class DeleteNodeLinkedList {
    public static void deleteNode(ListNode node) {
       if(node == null){
         return;
       }  
       node.val = node.next.val;
       node.next = node.next.next;
    }
    public static void print(){
        ListNode node = null; 
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static void main(String[] args) {

        ListNode llist = new ListNode(7);
        llist.next = new ListNode(8);
        llist.next.next = new ListNode(1);
        llist.next.next.next = new ListNode(3);
        
        System.out.println("\nCreated Linked list is: ");
        //llist.print();
        //llist.delete(8);
        //llist.print();

    }   
}
