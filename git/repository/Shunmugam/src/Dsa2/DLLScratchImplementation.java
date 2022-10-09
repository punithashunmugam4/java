package Dsa2;
import java.util.*;
public class DLLScratchImplementation {
Node head;
int size;
class Node{
	Node next;
	Node prev;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
		size++;
	}
}
void addLast(int data) {
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
	newnode.prev=temp;
}
void printList() {
	if(head==null) {
		System.out.println("No element");
		return;
	}
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.next;
		
	}
}
void addFirst(int data) {
	Node newnode=new Node(data);
	newnode.next=head;
	if(head!=null) {
		head.prev=newnode;
	}
	head=newnode;
}
void addsomewhere(int index,int k) {
	Node newnode=new Node(k);
	if(head==null && k<0) {
		head=newnode;
		return;
	}
	int count=0;
	Node temp=head;
	while(count<index-2) {
		temp=temp.next;
		count++;
	}
	newnode.next=temp.next;
	newnode.prev=temp;
	temp.next=newnode;
	if(temp.next!=null)
	temp.next.prev=newnode;
}
void removeithfromLast(int index) {
	if(head==null || index>size) {
		System.out.println("No element found");
		return;
	}
	Node temp1=head;
	Node temp2=head;
	int count=0;
	while(count<index) {
		temp2=temp2.next;
		count++;
	}
	while(temp2.next!=null) {
		temp1=temp1.next;
		temp2=temp2.next;
	}
	temp1.next=temp1.next.next;
	Node temp3=temp1.next;
	temp3.prev=temp3.prev.prev;
}
public static void main(String[] args) {
	DLLScratchImplementation obj=new DLLScratchImplementation();
	obj.addLast(3);
	obj.addLast(5);
	obj.addLast(9);
	obj.printList();
	obj.addFirst(4);
	System.out.println();
	obj.printList();
	obj.addsomewhere(2,11);
	System.out.println();
	obj.printList();
	obj.removeithfromLast(2);
	System.out.println();
	obj.printList();
}
	
}
