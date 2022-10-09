package Practices;

import java.util.Stack;

public class ValidParanthesis {
	public static boolean checkParanthesis(String str) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(' ) {
				st.push(str.charAt(i));
			}
			else {
				char s=str.charAt(i);
				char c=st.pop();
				switch (c) {
				case '{':
					if(s==']' || s==')')
						return false;
						break;
				case '[':
					if(s=='}' || s==')')
						return false;
						break;
				case '(':
					if(s==']' || s=='}')
						return false;
						break;
				}
			}
		}
		return true;
	}
public static void main(String []args) {
	String str="{[(]]}";
	System.out.println(checkParanthesis(str));
}
}
