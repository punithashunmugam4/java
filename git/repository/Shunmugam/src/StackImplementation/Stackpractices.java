package StackImplementation;
import java.util.*;
public class Stackpractices {
public static void main(String[] args) {
	Stack<String> stack=new Stack<>();
	stack.push("Welcome");
	stack.push("to");
	stack.push("Newton");
	stack.push("School");
	stack.push("Bangalore");
	System.out.println(stack.pop());
	System.out.println(stack);
	 System.out.println(stack.size());

     System.out.println(stack.peek());

     System.out.println(stack.isEmpty());
     Iterator list=stack.iterator();
     while(list.hasNext())
    	 System.out.print(list.next()+" ");
}
}
