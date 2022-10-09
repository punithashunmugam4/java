package Dsa2;

import java.util.LinkedList;

public class RemoveDuplicateFromLL {
	static Node head;
	int size;
	static class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				this.next=null;
			}
	}
public static void main(String[] args) {
	RemoveDuplicateFromLL list=new RemoveDuplicateFromLL();
	list.addLast(5);
	list.addLast(4);
	list.addLast(3);
	list.addLast(5);
	list.addLast(2);
	list.addLast(3);
	removeDuplicate();
	printList();
	removeDuplicate1();
	System.out.println();
	printList();
}
public void addLast(int data) {
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		return;
	}
	Node temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=newnode;
}
public static void removeDuplicate1() {
	Node temp=head;
	Node temp1=null;
	while(temp!=null && temp.next!=null) {
		temp1=temp;
		while(temp1.next!=null) {
			if(temp.data==temp1.next.data) {
				temp.next=temp.next.next;
				continue;
			}
			else
				temp1=temp1.next;
		}
		temp=temp.next;
	}
}
public static void removeDuplicate() {
	Node ptr1=head;
	Node ptr2=null;
	while(ptr1!=null && ptr1.next!=null) {
		ptr2=ptr1;
		while(ptr2.next!=null) {
			if(ptr1.data==ptr2.next.data) {
				ptr2.next=ptr2.next.next;
				System.gc();
			}
			else {
				ptr2=ptr2.next;
			}
		}
		ptr1=ptr1.next;
}
}
	static void printList()
	    {	
		if(head==null) {
			System.out.println("No element");
			return;
		}
		 	Node temp=head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	    }
}
