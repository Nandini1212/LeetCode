/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author nandini
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x; 
    }
  }
public class SortList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode k = l3;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                k.next = l1;
                l1 = l1.next;
            } else {
                k.next = l2;
                l2 = l2.next;
            }
            k = k.next;
        }
        if(l1 != null){
            k.next = l1;
        }
        if(l2 != null){
            k.next = l2;
        }
        return l3.next;
            
    }
    public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(2);
		n1.next.next = new ListNode(4);
               
                //printList( n1);
		ListNode n2 = new ListNode(5);
		n2.next = new ListNode(6);
		n2.next.next = new ListNode(4);
                //printList( n2); 		
		ListNode head  = mergeTwoLists(n1, n2);
                printList(head);
                
	}
 
	public static void printList(ListNode node) {
		while(node != null){
                    System.out.println(" " +node.val);
                    node = node.next;
                }
	}
}
