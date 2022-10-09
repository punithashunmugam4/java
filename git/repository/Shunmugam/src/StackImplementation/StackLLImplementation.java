package StackImplementation;

public class StackLLImplementation {
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
void push(int data) {
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		return;
	}
	newnode.next=head;
	head=newnode;
}
void pop() {
	if(head==null) {
		System.out.println("Stack Underflow");
		return;
	}
	head=head.next;
	
}
void top() {
	System.out.println(head.data);
	}
public static void main(String []args) {
	StackLLImplementation obj=new StackLLImplementation();
	obj.push(58);
	obj.push(89);
	obj.push(23);
	obj.pop();
	obj.top();
	
}

}
