/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import java.util.Stack;

/*
1) Traverse the given list from head to tail and push every visited node to stack.
2) Traverse the list again. For every visited node, pop a node from stack and compare data of popped node with currently visited node.
3) If all nodes matched, then return true, else false.

Time complexity of above method is O(n), but it requires O(n) extra space. Following methods solve this with constant extra space.
 */


public class IsPalindrome {
    public boolean isListPalindrome(ListNode head) {  
    Stack<ListNode> stack = new Stack<>();  
    ListNode node = head;  
    while(node != null) {  
        stack.push(node);  
        node = node.next;  
    }  
    while(head != null) {  
        if(head.val != stack.pop().val) return false;  
        head = head.next;  
    }  
    return true;  
    }
    
    /*
    1) Get the middle of the linked list.
2) Reverse the second half of the linked list.
3) Check if the first half and second half are identical.
4) Construct the original linked list by reversing the second half again and attaching it back to the first half
    */
    public boolean isListPalindromes(ListNode head) {  
    if(head==null || head.next==null) return true;  
    ListNode walker = head, runner = head;  
    while(walker!=null && runner!=null) {  
        walker = walker.next;  
        runner = runner.next;  
        if(runner!=null) {  
            runner = runner.next;  
        }  
    }  
    ListNode h = reverseLinkedList(walker);  
    while(h!=null && head!=null) {  
        if(h.val != head.val) return false;  
        h = h.next;  
        head = head.next;  
    }  
    return true;  
}  
  
public ListNode reverseLinkedList(ListNode head) {  
    ListNode dummy = new ListNode(0);  
    ListNode pre = dummy;  
    while(head != null) {  
        ListNode next = head.next;  
        head.next = pre.next;  
        pre.next = head;  
        head = next;  
    }  
    return dummy.next;  
}  

}
