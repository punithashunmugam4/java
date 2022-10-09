package Dsa2;
import Dsa2.Linkedlist.Node;

public class CircularLL {
	Node head;
	int size=0;
	//creating node class
	public class Node{
		String data;
		Node next;
		//parametrized constructor
		Node(String str)
		{
			this.data=str;
			this.next=null;//optional
			size++;
		}
		}
	public void addLast(String str) {
		Node newnode=new Node(str);
		int count=0;
		if(head==null) {//adding fist node head[8121]--->str["Vikings"]
			head=newnode;
		return;
		}
		Node ptr=head;//--->ptr[8121]-->str["Vikings"]
		while(ptr.next!=null) {//adding third node			ptr			
			ptr=ptr.next;// head[8121]-->["Vikings",2355]--->["is"]
		}//adding second node    ptr			  ptr.next      										ptr			ptr.next
		ptr.next=newnode;//head[8121]--->["Vikings",2355]--->["is"]			// head[8121]-->["Vikings",2355]--->["is",2345]--->["favourite"]
	}
	public void convert() {
		Node temp=head;
		while(temp.next!=null){
		    temp=temp.next;
		}
		temp.next=head;
	}
	public Node Insertion(String K){
		Node newnode=new Node(K);
		Node temp=head;
		while(temp.next!=head){
		    temp=temp.next;
		}     
		temp.next=newnode;
		newnode.next=head;
		return head;
		}
	void printlist() {
		Node ptr=head;//again make ptr to head to print from starting
		if(ptr==null)
		System.out.print("No node found");
		while(ptr.next!=head) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}
		public static void main(String []args) {
			CircularLL obj=new CircularLL();
			obj.addLast("Viking");
			obj.addLast("is");
			obj.addLast("favourite");
			obj.addLast("Series");
			obj.printlist();
			obj.convert();
		//	obj.printlist();
			obj.Insertion("great");
			obj.printlist();
}
}
