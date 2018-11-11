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
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode list = new ListNode(0);
        ListNode dummy = list;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            if(l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;                
            }
            dummy.next = new ListNode(carry % 10);
            carry = carry / 10;
            dummy = dummy.next;
        }
        return list.next;
    }
}
