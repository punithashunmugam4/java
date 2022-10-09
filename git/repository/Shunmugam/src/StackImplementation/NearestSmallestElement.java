package StackImplementation;

import java.util.Scanner;
import java.util.Stack;

public class NearestSmallestElement {
	public static void nearestsmall(int arr[],int n) {
		Stack<Integer> st=new Stack<>();
		int s[]=new int[n];
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && arr[i]<st.peek()) {
				st.pop();
			}
			s[i]=(st.isEmpty()) ? -1:st.peek();
			st.push(arr[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.print(s[i]+" ");
		}
	}
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	nearestsmall(arr,n);
}
}
