package Dsa2;

public class Linkedlist {
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
			ptr=ptr.next;
			count++;// head[8121]-->["Vikings",2355]--->["is"]
		}//adding second node    ptr			  ptr.next      										ptr			ptr.next
		ptr.next=newnode;//head[8121]--->["Vikings",2355]--->["is"]			// head[8121]-->["Vikings",2355]--->["is",2345]--->["favourite"]
		count++;
		System.out.println(count);
	}
	void printlist() {
		Node ptr=head;//again make ptr to head to print from starting
		if(ptr==null)
		System.out.print("No node found");
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}	
	}
	void addfirst(String str) {
		Node newnode=new Node(str);
		newnode.next=head;
		head=newnode;
	}
		void removelast(){
			if(head==null) {// no head or node present
				System.out.println("No node present");
				return;
			}
			if(head.next==null) {//no second node only one node
				head=null;	//one and only node is removed and made null
				return;
			}
			Node ptr=head;
			while(ptr.next.next!=null) {
				ptr=ptr.next;
			}
			ptr.next=null;
			size--;
		}
		void removefirst() {
			if(head==null) {
				System.out.print("No node found");
			}
			if(head.next==null) {
				System.out.print("only one node present and is removed");
			}
			head=head.next;
			size--;
		}
		void removemid() {
			Node temp=head;
			if(size==1) {
				head.next=null;
				return;
			}
			int index=size/2;
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		void removeKth(int k) {
			Node temp1=head;
			Node temp2=head;
			int count=0;
			if(head==null)
			return;
			while(count<=k) {
				if(temp2==null)
					return;
				temp2=temp2.next;
				count++;
			}
			if(temp2==null)
				return;
			while(temp2!=null) {
				temp1=temp1.next;
				temp2=temp2.next;
			}
			temp1.next=temp1.next.next;
		}
		String KthFromLast(int k) {
			Node temp1=head;
			Node temp2=head;
			int count=0;
			if(head==null)
			return"";
			while(count<k) {
				if(temp2==null)
					return"";
				temp2=temp2.next;
				count++;
			}
			
			if(temp2==null)
				return head.data;
			while(temp2!=null) {
				temp1=temp1.next;
				temp2=temp2.next;
			}
			return temp1.data;
		}
		
public static void main(String []args) {
	Linkedlist obj=new Linkedlist();
	obj.addLast("Viking");
	obj.addLast("is");
	obj.addLast("favourite");
	obj.addLast("Series");
	obj.printlist();
//	obj.removelast();
//	System.out.println();
//	obj.printlist();
//	obj.addfirst("Welcome");
//	System.out.println();
//	obj.printlist();
//	obj.removefirst();
//	System.out.println();
//	obj.printlist();
//	obj.removemid();
//	System.out.println();
//	obj.printlist();
	System.out.println();
	System.out.println(obj.KthFromLast(1));
	obj.removeKth(2);
	System.out.println();
	obj.printlist();
	
}
}
