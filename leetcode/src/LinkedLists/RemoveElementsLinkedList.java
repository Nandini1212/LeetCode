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
class ListNo {
      int val;
      ListNo next;
      ListNo(int x) { val = x; }
}
public class RemoveElementsLinkedList {
    public ListNo removeElements(ListNo head, int val) {
        ListNo list = new ListNo(0);
        list.next = head;
        ListNo node = list;
        while(node.next != null){
            if(node.next.val == val){
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return list.next;
    }
    public static void main(String[]args){
        ListNode llist = new ListNode(7);
        llist.next = new ListNode(8);
        llist.next.next = new ListNode(1);
        llist.next.next.next = new ListNode(3);
    }
}
