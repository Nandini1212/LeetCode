/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
class ListNde {
      int val;
      ListNde next;
      ListNde(int x) { val = x; }
 }
public class ReoderList {
    /*
    public static void reorderList(ListNde head) {
        if(head == null || head.next == null){
            return;
        }
        ListNde fast = head;
        ListNde slow = head;
        ListNde prev = null;
        while(fast != null || fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev != null){
            prev.next = null;
        }
        ListNde last = reverseList(slow);
        mergeList(head, last);
    }
    public static ListNde reverseList(ListNde head){
        if(head == null){
            return null;
        }
        ListNde list = new ListNde(0);
        ListNde pre = list;
        while(head != null){
            ListNde temp = head;
            head.next = pre.next;
            pre.next = head;
            head = temp;
        }
        return list.next;
    }
    public static ListNde mergeList(ListNde l1, ListNde l2){
        ListNde head = l1;
        while(l1 != null && l2 != null){
            ListNde temp = l1.next;
            l1.next = l2;
            l1 = l2;
            l2 = temp;
        }
        return head;
    }*/
    
    public static void printList() {
        ListNods node = null;
        while(node != null){
            System.out.println(" " +node.val);
            node = node.next;
        }
    }
    
    public static void reorderList(ListNde head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNde start = head;
        ListNde tail = head;
        HashMap<ListNde, ListNde> map = new HashMap<>();//Store the pre node of every node
        while (tail.next != null) {
            map.put(tail.next, tail);
            tail = tail.next;
        }
        while (start != tail && start.next != tail) {
            ListNde temp = start.next;
            tail.next = start.next;
            start.next = tail;
            tail = map.get(tail);
            start = temp;
        }
        tail.next = null;
    }

    
public static void main(String[]args){
        ListNde n1 = new ListNde(1);
        n1.next = new ListNde(2);
	n1.next.next = new ListNde(3);        
        n1.next.next.next = new ListNde(4);

        reorderList(n1);
        printList();
        
    }
}
