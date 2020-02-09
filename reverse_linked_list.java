package linkedlist_pp;
import java.util.*;


class Reverse_linkedList 
{ 
 static Node head; 
 static class Node 
 { 

     int data; 
     Node next; 

     Node(int d) 
     { 
         data = d; 
         next = null; 
     } 
 } 
 
 Node reverse(Node node) 
 { 
     Node cur=node;
     Node prev=null;
     Node next=null;
     while(cur!=null)
     {
    	 next=cur.next;
    	 cur.next=prev;
    	 prev=cur;
    	 cur=next;
     }
     return prev;
     //  or node=prev  coz prev is the last elememt
    //   return node ;
 } 

 // prints content of double linked list 
 void printList(Node node) 
 { 
     while (node != null) { 
         System.out.print(node.data + " "); 
         node = node.next; 
     } 
 } 

 
 public static void main(String[] args) 
 { 
	 Reverse_linkedList list = new Reverse_linkedList(); 
     list.head = new Node(1); 
     list.head.next = new Node(2); 
     list.head.next.next = new Node(3); 
     list.head.next.next.next = new Node(4); 
     
     System.out.println("Given Linked list"); 
     list.printList(head); 
     head = list.reverse(head); 
     System.out.println(""); 
     System.out.println("Reversed linked list "); 
     list.printList(head); 
     
 } 
} 
