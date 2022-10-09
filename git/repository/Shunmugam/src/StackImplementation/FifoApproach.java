package StackImplementation;

import java.util.Stack;

public class FifoApproach {
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	void push(int n) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(n);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}	
		}
	int pop() {
		if(s1.isEmpty()) {
			return -1;
		}
		return s1.pop();
	}
public static void main(String []args) {
	FifoApproach list=new FifoApproach();
	list.push(2);
	list.push(4);
	list.push(6);
	list.push(8);
	System.out.println(list.pop());
}
}
