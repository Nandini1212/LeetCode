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
class ListNods {
      int val;
      ListNods next;
      ListNods(int x){
          val = x; 
      }
  }
public class SwapNodesInPairs {
    public static ListNods reverseList(ListNods head) {
        ListNods list = new ListNods(0);
        while(head != null){
            ListNods temp = head.next;
            head.next = list.next;
            list.next = head;
            head = temp;
        }
        return list.next;
    }
    public static ListNods swapPairs(ListNods head){
        if(head == null || head.next == null){
            return head;
        }
        ListNods temp = head;
        while(temp != null && temp.next != null){
            int k = temp.val;
            temp.val = temp.next.val;
            temp.next.val = k;
            temp = temp.next.next;
        }
        return head;
        
    }
    public static void printList(ListNods node) {
        while(node != null){
            System.out.println(" " +node.val);
            node = node.next;
        }
    }
    public static void main(String[]args){
        ListNods n1 = new ListNods(1);
        n1.next = new ListNods(2);
	n1.next.next = new ListNods(3);        
        n1.next.next.next = new ListNods(4);

        ListNods newc = swapPairs(n1);
        printList(newc);
    }
}
