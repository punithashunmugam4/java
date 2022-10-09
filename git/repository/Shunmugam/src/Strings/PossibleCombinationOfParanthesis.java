package Strings;

import java.util.Scanner;

public class PossibleCombinationOfParanthesis {
	public static void printparanthesis(char []str,int n,int index,int open,int close){
		if(close==n) {
			for(int i=0;i<str.length;i++)
			System.out.print(str[i]);
			System.out.println();
			return;
		}
		if(open>close) {
			str[index]='}';
			printparanthesis(str,n,index+1,open,close+1);
		}
		if(open<n) {
			str[index]='{';
			printparanthesis(str,n,index+1,open+1,close);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char str[]=new char[2*n];
	printparanthesis(str,n,0,0,0);
}
}
