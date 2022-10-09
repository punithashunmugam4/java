package Dsa2;

public class LLIsSubsetOfAnotherLL {
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.next=null;
			this.data=data;
		}
	}
public static void main(String[] args) {
	Node first=new Node(3);
	first.next=new Node(4);
	first.next.next=new Node(5);
	first.next.next.next=new Node(6);
	Node second=new Node(4);
	second.next=new Node(5);
	System.out.println(checkForSubset(first,second));
}
static boolean checkForSubset(Node first,Node second) {
Node ptr=first;
Node ptr2=second;
if(ptr==null && ptr2==null) {
	return true;
}
if(ptr2==null || (ptr2!=null && ptr==null))
return false;
while(ptr!=null) {
	while(ptr2!=null) {
		if(ptr.data==ptr2.data) {
			ptr=ptr.next;
			ptr2=ptr2.next;
		}
		else break;
	}
	if(ptr2==null)
		return true;
	ptr=ptr.next;
	ptr2=second;
}
return false;
}
}
