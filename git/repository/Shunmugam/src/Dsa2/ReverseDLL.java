package Dsa2;

import java.util.LinkedList;

public class ReverseDLL {
	Node head;
	int size;
	class Node{
		Node next;
		Node prev;
		int data;
		Node(int data){
			this.next=null;
			this.prev=null;
			this.data=data;
			size++;
		}
}
	public void add(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
			}
	}
	public void printlist() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void reverseprint() {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
	public void reverseDll() {
		Node temp=head;
		Node ptr=head;
		Node result=null;
		while(temp!=null) {
			temp=temp.next;
			ptr.next=result;
			ptr.prev=temp;
			result=ptr;
			ptr=temp;
		}
		head=result;
	}
	public void addFirst(int data) {
		Node newnode=new Node(data);
		if(head!=null) {
		newnode.next=head;
		head.prev=newnode;
		}
		head=newnode;
	}
	public void addanywhere(int index,int data) {
		if(index>size) {
			System.out.println("Index invalid");
			return;
		}
		Node newnode=new Node(data);
		Node temp=head;
		for(int i=0;i<index-2;i++) {
			temp=temp.next;
		}
		newnode.next=temp.next;
		newnode.prev=temp;
		if(temp.next!=null) {
			temp.next.prev=newnode;
		}
		temp.next=newnode;
		
	}
public static void main(String []args) {
	ReverseDLL obj=new ReverseDLL();
	obj.add(5);
	obj.add(6);
	obj.add(7);
	obj.add(8);
	obj.add(9);
	obj.printlist();
	System.out.println();
	obj.reverseprint();
	obj.reverseDll();
	System.out.println();
	obj.printlist();
	obj.addFirst(4);
	System.out.println();
	obj.printlist();
	obj.addanywhere(3,10);
	System.out.println();
	obj.printlist();
}
}

