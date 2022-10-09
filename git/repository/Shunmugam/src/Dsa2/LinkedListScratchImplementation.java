package Dsa2;

public class LinkedListScratchImplementation {
Node head;
int size;
class Node{
	Node next;
	String data;
	Node(String str){
		this.data=str;
		this.next=null;
		size++;
	}
}
void addLast(String str) {
	Node newnode=new Node(str);
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
void printList() {
	if(head==null) {
		System.out.println("No node to print");
		return;
	}
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
void addFirst(String str) {
	Node newnode=new Node(str);
	newnode.next=head;
	head=newnode;
}
void addmiddle(String str) {
	Node newnode=new Node(str);
	if(head==null) {
		head=newnode;
		return;
	}
	if(head.next==null) {
		head.next=newnode;
		return;
	}
	Node temp=head;
	for(int i=0;i<size;i++) {
		if(i==(size/2)-1) {
			Node temp2=temp.next;
			temp.next=newnode;
			newnode.next=temp2;
			break;
		}
		temp=temp.next;
	}
	
}
void removekthfromLast(int k) {
	if(head==null) {
		System.out.println("no element");
		return;
	}
	int count=0;
	Node temp1=head;
	Node temp2=head;
	while(count<k) {
		temp2=temp2.next;
		count++;
	}
	if(temp2.next==null) {
		head.next=null;
		return ;
	}
	while(temp2.next!=null) {
		temp1=temp1.next;
		temp2=temp2.next;
	}
	temp1.next=temp1.next.next;
	
}
public static void main(String[] args) {
	 LinkedListScratchImplementation obj=new  LinkedListScratchImplementation();
	 obj.addLast("Newton");
	 obj.addLast("School");
	 obj.printList();
	 System.out.println();
	 obj.addFirst("to");
	 obj.addFirst("Welcome");
	 obj.printList();
	 System.out.println();
	 obj.addmiddle("Mr");
	 obj.printList();
	 obj.removekthfromLast(2);
	 System.out.println();
	 obj.printList();
}
}
