package StackImplementation;
import java.util.*;
public class StackImplement {
int arr[];
int capacity;
int top;
StackImplement(int size){
	arr=new int[size];
	capacity=size;
	top=-1;
}
void push(int data) {
	if(isStackFull()) {
		System.out.println("Stack is already full, no insertion can be done");
		return;
	}
	 System.out.println("Lets push the element in stack");
     top++;
     arr[top]=data;
}
int pop() {
	if(isStackEmpty()) {
		System.out.println("No element is found to pop");
		return -1;
	}
	System.out.println("Lets remove the element from stack");
	int topElement=arr[top];
	top--;
	return topElement;
}
boolean isStackFull() {
	return top==capacity-1;
}
boolean isStackEmpty() {
	return top==-1;
}
int size() {
	return top+1;
}
int peek() {
	return arr[top];
}
void printstack() {
	for(int i=top;i>=0;i--)
		System.out.print(arr[i]+" ");
	System.out.println();
}
public static void main(String[] args) {
	StackImplement stack=new StackImplement(10);
	stack.push(4);
	stack.push(5);
	stack.push(96);
	stack.push(45);
	stack.push(6);
	System.out.println(stack.size());
	stack.printstack();
	System.out.println(stack.pop());
	stack.printstack();
	System.out.println(stack.peek());
}
}
