package DynamicProgramming;

import java.util.Scanner;

public class LongestPalindromicPrefix {
	public static String lengthOfPalindrome(String str,int n) {
		if(n==0)
			return "";
		if(str.charAt(0)!=str.charAt(n))
			return lengthOfPalindrome(str,n-1);
		else
			return str.substring(0,n+1);
	}
	public static String lengthOfPalindromesuffix(String str,int n,int i) {
		if(i==n)
			return "";
		if(str.charAt(i)!=str.charAt(n))
			return lengthOfPalindromesuffix(str,n,i+1);
		else
			return str.substring(i,n+1);
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int n=str.length();
	String len=lengthOfPalindrome(str,n-1);
	System.out.println(len);
	String res1=lengthOfPalindromesuffix(str,n-1,0);
	System.out.println(res1);
}
}
