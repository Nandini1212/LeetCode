/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import java.util.Stack;

/**
 *
 * @author nandini
 */
public class AddTwoNumbersii {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode list = new ListNode(0);
        int carry = 0;
        int v1 = 0;
        int v2 = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty() || carry == 1){
            if(stack1.isEmpty()){
                v1 = 0;
            } else {
                v1 = stack1.pop();
            }
            
            if(stack2.isEmpty()){
                v2 = 0;
            } else {
                v2 = stack2.pop();
            }
            int sum = v1 + v2 + carry;
            if(sum >= 10){
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode node = new ListNode(sum % 10);
            node.next = list.next;
            list.next = node;
        }
        return list.next;
    }
}
