package StackImplementation;
import java.util.*;
public class BalancedBracket {
//	String arr[];
//	int capacity;
//	int top;
//	BalancedBracket(int size){
//		arr=new String[size];
//		capacity=size;
//		top=-1;
//	}
	public static boolean isBalanced(String str) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
				continue;
			}
		if(stack.empty())
			return false;
		char popped=stack.pop();
		switch (c) {
		case ')':
			if(popped=='[' || popped=='{')
                return false;
            break;

        case '}' :
            if(popped=='[' || popped=='(')
                return false;
            break;

        case ']' :
            if(popped=='(' || popped=='{')
                return false;
            break;
		}
		}
		return stack.empty();
	}
	public static void main(String[] args) {
		String str="([{}])";

        String str1="[()]{}{[()()]()}";

        String str2="[(])";
        System.out.println(isBalanced(str));
        System.out.println(isBalanced(str1));
        System.out.println(isBalanced(str2));
	}
	
}
