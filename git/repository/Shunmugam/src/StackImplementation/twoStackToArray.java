package StackImplementation;
import java.util.*;
public class twoStackToArray {
public static void main(String []args) {
	Stack<Integer> st=new Stack<>();
	Stack<Integer> st1=new Stack<>();
	st.add(4);
	st.add(3);
	st.add(2);
	st.add(1);
	st1.add(8);
	st1.add(7);
	st1.add(6);
	st1.add(5);
	int a=st.size();
	int b=st1.size();
	int n=st.size()+st1.size();
	int arr[]=new int[n];
	System.out.println(n);
	for(int i=0;i<a;i++) {
		arr[i]=st.pop();
	}
	for(int i=a;i<n;i++) {
		arr[i]=st1.pop();
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
