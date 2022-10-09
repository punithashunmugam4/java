package StackImplementation;

import java.util.Stack;

public class Reversewords {
	public static void main(String []args) {
String str="I am java developer";
Stack<Character> st=new Stack<>();
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)!=' ') {
		st.push(str.charAt(i));
	}
	else {
		while(!st.empty())
		System.out.print(st.pop());
		System.out.print(" ");
	}
}
while(!st.empty())
	System.out.print(st.pop());
	}
}
