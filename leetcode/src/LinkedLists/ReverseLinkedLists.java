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

public class ReverseLinkedLists {
    static Node head;
    
    static class Node {
        int value;
        Node next;
        Node(int value){
            value = value;
            next = null;
        }
    }
    static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public static void printList(ListNode node) {
	while(node != null){
            System.out.println(" " +node.val);
            node = node.next;
        }
    }
    public static void main(String[]args){
        ReverseLinkedLists list = new ReverseLinkedLists();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
    
}
