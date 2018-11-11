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
class List {
      int val;
      List next;
      List(int x){
          val = x; 
      }
  }
public class InsertionSortLinkedList {
    public static List insertionSortList(List head) {
        List dummy = new List(0);
        while(head != null){
            List node = dummy;
            System.out.println("node is :" + node.val);
            while(node.next != null && node.next.val < head.val){
                System.out.println("node next is :" + node.val + " node next val :"+node.next.val
                + "head is :"+head.val);
                node = node.next;
                System.out.println("node next is :" + node.val);

            }
            List temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }
        return dummy.next;
    }
    public static void printList(List node) {
        while(node != null){
            System.out.println(" " +node.val);
            node = node.next;
        }
    }
    public static void main(String[]args){
        List n1 = new List(1);
        n1.next = new List(3);
	n1.next.next = new List(5);        
        n1.next.next.next = new List(4);
        n1.next.next.next.next = new List(2);
        
        List newc = insertionSortList(n1);
        printList(newc);
    }
}
