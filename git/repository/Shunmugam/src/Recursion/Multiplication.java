package Recursion;

import java.util.Scanner;

public class Multiplication {
	public static int multiply(int n,int m) {
		if(m>n) {
			return multiply(m,n);
		}
		if(m==0)
			return 0;
		return (n+multiply(n,m-1));
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int res=multiply(n,m);
	System.out.println(res);
}
}
