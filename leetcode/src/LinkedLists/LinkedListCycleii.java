/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import java.util.HashSet;

/**
 *
 * @author nandini
 */
class ListNodees {
      int val;
      ListNodees next;
      ListNodees(int x){
          val = x; 
      }
  }
public class LinkedListCycleii {
    public ListNodees detectCycle(ListNodees head) {
        HashSet<ListNodees> set = new HashSet<ListNodees>();
        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
    
    public static ListNodees detectCycles(ListNodees head) {
        ListNodees slow = head;
        ListNodees fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNodees temp = head;
                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
        return null;
    }
    public static void printList(ListNodees node) {
        while(node != null){
            System.out.println(" " +node.val);
            node = node.next;
        }
    }
    public static void main(String[]args){
        ListNodees n1 = new ListNodees(1);
        n1.next = new ListNodees(2);
	n1.next.next = new ListNodees(3);        
        n1.next.next.next = new ListNodees(4);
        n1.next.next.next.next = new ListNodees(6);
        n1.next.next = new ListNodees(5); 

        ListNodees newc = detectCycles(n1);
        printList(newc);
    }
}
