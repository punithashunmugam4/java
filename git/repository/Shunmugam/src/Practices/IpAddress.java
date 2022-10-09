package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class IpAddress {
	public static void printpossibleIP(String str,int index,int i,String []dp) {
		if(i==4) {
		if(index<str.length()) {
			return;
		}
		for(int j=0;j<3;j++) {
			System.out.print(dp[j]+".");
		}
		System.out.println(dp[3]);
		return;
	}
		for(int j=index;j<str.length();j++) {
			dp[i]=dp[i]+str.charAt(j);
			printpossibleIP(str,j+1,i+1,dp);
		}
		dp[i]="";
		return;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String dp[]=new String[str.length()+1];
	Arrays.fill(dp,"");
	printpossibleIP(str,0,0,dp);
}
}
