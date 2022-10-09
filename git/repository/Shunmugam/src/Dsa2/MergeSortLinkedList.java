package Dsa2;
class Node{
	Node next;
	int data;
	Node(int data){
		this.next=null;
		this.data=data;
	}
}
public class MergeSortLinkedList {
	public static Node mergesort(Node head) {
		if(head.next==null) {
			return head;
		}
		Node mid=findmid(head);
		Node head2=mid.next;
		mid.next=null;
		Node newhead1=mergesort(head);
		Node newhead2=mergesort(head2);
		Node finalhead=merge(newhead1,newhead2);
		return finalhead;
	}
	public static Node merge(Node head1,Node head2) {
		Node merged=new Node(-1);
		Node temp=merged;
		while(head1!=null && head2!=null) {
			if(head1.data>head2.data) {
				temp.next=head2;
				head2=head2.next;
			}
			else {
				temp.next=head1;
				head1=head1.next;
			}
			temp=temp.next;
		}
		while(head1!=null) {
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		while(head2!=null) {
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		return merged.next;
	}
	public static Node findmid(Node head) {
		Node slow=head;
		Node fast=head.next;
		while(slow.next!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
	public static void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
public static void main(String []args) {
	Node head=new Node(7);
	Node temp=head;
	temp.next=new Node(10);
	temp=temp.next;
	temp.next=new Node(5);
	temp=temp.next;
	temp.next=new Node(20);
	temp=temp.next;
	temp.next=new Node(3);
	temp=temp.next;
	temp.next=new Node(2);
	temp=temp.next;
	head=mergesort(head);
	printList(head);
}
}
