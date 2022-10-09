package Strings;

import java.util.Scanner;

public class IntToStringAndVIceversa {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		int c=Integer.parseInt(s1);
		System.out.println(c);
	}
}
