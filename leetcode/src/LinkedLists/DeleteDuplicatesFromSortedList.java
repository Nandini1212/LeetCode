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
public class DeleteDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode list = head;
        while(list != null && list.next != null){
            if(list.val == list.next.val){
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }
        return head;
    }
}
