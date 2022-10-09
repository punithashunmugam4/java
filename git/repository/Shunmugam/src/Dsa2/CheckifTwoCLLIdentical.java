package Dsa2;

public class CheckifTwoCLLIdentical {
	static Node head1,head2,tail1,tail2;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public static Node insertNode(Node head,Node tail,int data) {
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		tail=newnode;
		newnode.next=newnode;
		return newnode;
	}
	else {
		Node temp=newnode;
		temp.next=tail.next;
		tail.next=temp;
		return tail.next;
	}
}
public static boolean checkifIdentical(Node head1,Node head2) {
	if(head1.data!=head2.data) {
		return false;
	}
	else {
		Node temp1=head1;
		Node temp2=head2;
		while(temp1.next!=head1 && temp2.next!=head1 ) {
		if(temp1.data!=temp2.data) {
			return false;
		}
		temp1=temp1.next;
		temp2=temp2.next;
		}
		return true;
	}
}
public static void main(String []args) {
	head1=null;
	tail1=null;
	head1=tail1=insertNode(head1,tail1,1);
	tail1=insertNode(head1,tail1,2);
	tail1=insertNode(head1,tail1,3);
	tail1=insertNode(head1,tail1,4);
	tail1=insertNode(head1,tail1,5);
	
	head2=null;
	tail2=null;
	head2=tail2=insertNode(head2,tail2,1);
	tail2=insertNode(head2,tail2,2);
	tail2=insertNode(head2,tail2,3);
	tail2=insertNode(head2,tail2,4);
	tail2=insertNode(head2,tail2,5);
	boolean flag=checkifIdentical(head1,head2);
	if(flag)
		System.out.println("YES");
	else
		System.out.println("NO");
}
}
