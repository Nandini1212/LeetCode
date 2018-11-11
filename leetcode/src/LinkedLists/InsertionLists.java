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
public class InsertionLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null ){
            return  null ;
        }
        ListNode a = headA;
        ListNode b = headB;
         while (a != b) {
             if(a != null){
                 a = a.next;
             } else {
                a = headB; 
             }
             if(b != null){
                 b = b.next;
             } else {
                b = headA; 
             }
            
            
        }
        return a;
    }
    public static void printList(ListNode node) {
        while(node != null){
            System.out.println(" " +node.val);
            node = node.next;
        }
    }
    public static void main(String[]args){
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(3);
	n1.next.next = new ListNode(5);
               

        ListNode n2 = new ListNode(2);
        n2.next = new ListNode(5);
        n2.next.next = new ListNode(9);
        
        ListNode newc = getIntersectionNode(n1, n2);
        printList(newc);
    }
}
