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
      ListNo(int x){
          val = x; 
      }
  }
public class LinkedListCycle {
    public boolean hasCycle(ListNo head){
        ListNo fast = head;
        ListNo slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
