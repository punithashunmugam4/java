package Dsa2;

import java.util.LinkedList;

public class LLtwoIsSubsetOfLLOne {
public static void main(String []args) {
	LinkedList<Integer> list1=new LinkedList<>();
	LinkedList<Integer> list2=new LinkedList<>();
	list1.push(1);
	list1.push(3);
	list1.push(5);
	list1.push(7);
	list1.push(9);
	list1.push(2);
	list2.push(7);
	list2.push(9);
	list2.push(2);
//	System.out.println(list1.peek());
;	boolean flag=false;
	int i=list2.size();
	while(!list1.isEmpty()) {
		int popped=list1.pop();
		int count=0;
		while(!list2.isEmpty() && popped==list2.peek()) {
			count++;
			list2.pop();
			popped=list1.pop();
			if(count==i) {
				flag=true;
				break;
			}
		}
		if(list2.isEmpty())
			break;
	}
	System.out.println(flag);
}
}
