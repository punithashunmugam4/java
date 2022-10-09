package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class PossibleIPAddress {
	public static void possibleIP(int i,int index,String str,String res[]) {
		if(i==4) {
			if(index<str.length())
				return;
			for(int j=0;j<3;j++) {
			System.out.print(res[j]+".");
			}
			System.out.print(res[3]);
			System.out.println();
			return;
		}
		for(int j=index;j<str.length();j++) {
		res[i]+=str.charAt(j);
		possibleIP(i+1,j+1,str,res);
		}
		res[i]="";
		return;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String res[]=new String[4];
	Arrays.fill(res,"");
	possibleIP(0,0,str,res);
}
}
