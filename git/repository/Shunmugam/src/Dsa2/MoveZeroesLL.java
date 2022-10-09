package Dsa2;
import java.util.*;
public class MoveZeroesLL {
	int size=0;
	Node head;
	public class Node{
		int data;
		Node next; 
		Node(int str){
			this.data=str;
			this.next=null;
			size++;
		}
	}
	void addLast(int str) {
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
	void printlist(){
		Node temp=head;
		if(temp==null) {
			System.out.println("there is no node to print");
//			return;
		}
//		if(head.next==null)
//			System.out.println(head.data);
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	Node movezeroes() {
		ArrayList<Integer> a=new ArrayList<>();
		int c=0;
		while(head!=null) {
			if(head.data==0)
				c++;
			else
				a.add(head.data);
			head=head.next;
				}
		head=null;
		for(int i=a.size()-1;i>=0;i--) {
			if(head==null)
				head=new Node(a.get(i));
			else {
				Node temp=new Node(a.get(i));
				temp.next=head;
				head=temp;
			}
		}
		while(c-->0) {
			Node temp=new Node(0);
			temp.next=head;
			head=temp;
		}
		return head;
		
	}
public static void main(String[] args) {
	MoveZeroesLL obj=new MoveZeroesLL();
	obj.addLast(2);
	obj.addLast(0);
	obj.addLast(6);
	obj.addLast(5);
	obj.addLast(0);
	obj.movezeroes();
	obj.printlist();
}
}
