/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macysPrep;

import java.util.LinkedList;

/**
 *
 * @author nandini
 */
class LinkedLists {
    
    Node head;
    
    class Node {
        int value;
        Node next;
        //constuctor to create a new node
        Node(int val) {
            value = val;
            next = null;
        }
    }
        
        public void insertAtHead(int value) {
            Node newNode = new Node(value);
            if(newNode == null) {
                System.out.println("Problem with node creation");
            }
            if(head == null) {
                head = new Node(value);
                return;
            }
            newNode.next = head;
            head = newNode;
        }        
        //insert a node after given prev node
        public void insertAfterGiven(Node prevNode, int value) {
            Node newNode = new Node(value);
            if(prevNode == null) {
                System.out.println("Node shouldn't be null");
                return;
            }
            if(newNode == null) {
               System.out.println("Problem with node creation");
            }
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        
        public void insertAtTail(int value) {
            Node newNode = new Node(value);
            if(newNode == null) {
               System.out.println("Problem with node creation");
            }
            //if the linked list as empty make the new node as head
            if(head == null) {
                head = new Node(value);
                return;
            }
            newNode.next = null;
            Node iterator = head;
            while(iterator.next != null) {
                iterator = iterator.next;                
            }
            iterator.next = newNode;
            return;            
        }
        
        public void deleteNode(int position) {
            if(head == null) {
                return;
            }
            if(position == 0) {
                head = head.next;
                return;
            }
           
            Node iterator = head;
            int index = 0;
            if(iterator == null || iterator.next == null) {
                return;
            }
            while(iterator != null && index < position - 1) {

                    iterator = iterator.next;
            } 
            
            Node nextNode = iterator.next.next;
            iterator.next = nextNode;
        }
        
        public void insert(int value) {
            Node newNode = new Node(value);
            if(head == null) {
                head = newNode;
                return;
            }
            Node iterator = head;
            while(iterator != null) {
                iterator = iterator.next;
            }
            iterator.next = iterator;
        }
        
        public void printNode() {
            Node iterator = head;
            while(iterator != null) {
                System.out.println(iterator.value + " ");
                iterator = iterator.next;
            }
        }    
    
    public static void main(String args[]) {
      LinkedLists llist = new LinkedLists ();
        
        llist.insertAtHead(1);
        llist.insertAtTail(4);
        llist.insertAtHead(7);
        llist.insertAtHead(8);
        llist.insertAfterGiven(llist.head,5);
        System.out.println("Linked List");
        llist.deleteNode(2);
        llist.printNode();
        
    }    
}
