package Dsa2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkedListImplementation1 {
Node head;
int size;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
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
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=newnode;
}
void printList() {
	if(head==null) {
		System.out.println("No element to print");
		return;
	}
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
 int pop() {
	if(head==null) {
		System.out.println("No element to pop");
		return 0;
	}
	if(head.next==null) {
		int a=head.data;
		head=null;
		size--;
		return a;
	}
	Node temp=head;
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	int poped=temp.next.data;
	temp.next=null;
	size--;
	return poped;
}
 boolean isEmpty(){
	 return size==0;
 }
void reverse() {
	Stack<Integer> st=new Stack<>();
	while(size>0) {
	st.add(pop());
	}
	List<Integer> list=new ArrayList<>();
	list.addAll(st);
	for(Integer i:list) {
		System.out.print(i+" ");
	}
}
public static void main(String []args) {
	LinkedListImplementation1 obj=new LinkedListImplementation1();
	obj.addLast(324);
	obj.addLast(86);
	obj.addLast(23);
	obj.addLast(779);
	obj.printList();
	System.out.println();
	obj.reverse();
	
}
}
