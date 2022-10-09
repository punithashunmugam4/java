package Dsa2;

import java.util.LinkedList;

public class MergeLinkedList {
	Node L1;
	Node L2;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static Node mergeLl(Node L1,Node L2) {
		Node res=new Node(0);
		Node ptr=res;
		while(true) {
		if(L1==null) {
			ptr.next=L2;
			break;
		}
		if(L2==null) {
			ptr.next=L1;
			break;
		}
		if(L1.data<=L2.data) {
			ptr.next=L1;
			L1=L1.next;
		}
		else {
			ptr.next=L2;
			L2=L2.next;
		}
		ptr=ptr.next;
		}
		return res.next;
	}
public static void main(String []args){
	Node L1=new Node(2);
	L1.next=new Node(3);
	L1.next.next=new Node(5);
	L1.next.next.next=new Node(7);
	Node L2=new Node(4);
	L2.next=new Node(6);
	L2.next.next=new Node(8);
	L2.next.next.next=new Node(9);
	Node res=mergeLl(L1,L2);
	while(res.next!=null) {
		System.out.print(res.data+" ");
		res=res.next;
	}
}
}
