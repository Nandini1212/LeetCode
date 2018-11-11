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
public class RemoveNthNodeFromLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n <= 0){
            return null;
        }
        ListNode list = new ListNode(0);
        list.next = head;
        ListNode preDelete = list;
        for(int i = 0; i < n; i++){
            if(head == null){
                return null;
            }
            head = head.next;
        }
        while(head != null){
            head = head.next;
            preDelete = preDelete.next;
        }
        preDelete.next = preDelete.next.next;
        return list.next;
    }
 
}
