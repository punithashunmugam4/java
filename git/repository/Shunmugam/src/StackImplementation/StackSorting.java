package StackImplementation;

import java.util.Stack;

public class StackSorting {
	public static Stack<Integer> sorting(Stack<Integer> st){
		Stack<Integer> temp=new Stack<>();
		while(!st.empty()) {
			int curr=st.pop();
			while(!temp.empty()&& temp.peek()<curr) {
			st.push(temp.pop());
			}
			temp.push(curr);
		}
		return temp;
	}
public static void main(String[]args) {
	Stack<Integer> st=new Stack<>();
	st.add(3);
	st.add(5);
	st.add(2);
	st.add(7);
	Stack<Integer> temp=sorting(st);
	while(!temp.empty()) {
	System.out.print(temp.pop()+" ");
	}
}
}
