/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Some;

import java.util.Random;

/**
 *
 * @author nandini
 */

    

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class LinkedListRandomList {
    private ListNode head;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomList(ListNode head) {
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int count = 1;
        int result = head.val;
        ListNode curr = head.next;
        while(curr != null){
            if(new Random().nextInt(++count) == 0){
                result = curr.val;
            }
            curr = curr.next;
        }
        return result;
    }
}
