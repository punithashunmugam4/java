package Strings;

import java.util.Scanner;

public class LargeNunmberMultiplication {
	public static String multiplication(String s1,String s2) {
		int n1=s1.length();
		int n2=s1.length();
		int result[]=new int[n1+n2];
		int i_n1=0;
		for(int i=n1-1;i>=0;i--) {
			int carry=0;
			int i_n2=0;
			int l1=s1.charAt(i);
			for(int j=n2-1;j>=0;j--) {
				int l2=s2.charAt(j);
				int sum=l1*l2+result[i_n1+i_n2]+carry;
				carry=sum/10;
				result[i_n1+i_n2]=sum%10;
				i_n2++;
			}
			if(carry>0) {
				result[i_n1+i_n2]+=carry;
			}
			i_n1++;
		}
		int i=result.length-1;
		while(i>=0 && result[i]==0)
			i--;
		if(i==-1) {
			return "0";
		}
		String fnl="";
		while(i>=0) {
			fnl+=(result[i--]);
		}
		return fnl;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	System.out.println(multiplication(s1,s2));
}
}
