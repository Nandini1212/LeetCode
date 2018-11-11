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
class ListN {
      int val;
      ListN next;
      ListN(int x){
          val = x; 
      }
  }
public class OddEvenList {
    public static ListN oddEvenList(ListN head){
        if(head == null){
            return null;
        }
        ListN odd = head;
        ListN even = head.next;
        ListN evenHead = even;
        
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        //last odd node next is the first even;
        odd.next = evenHead;
        return head;
    }
    
}
