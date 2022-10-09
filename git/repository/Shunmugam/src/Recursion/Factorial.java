package Recursion;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		while(n>=1) {
			n*=n-1;
		}
		return n;
	}
	public static int factorial(int n) {
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int res=factorial(n);
System.out.println(res);
int res1=fact(n);
System.out.println(res);
}
}
