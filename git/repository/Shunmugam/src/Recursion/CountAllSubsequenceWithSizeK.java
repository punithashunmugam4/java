package Recursion;

import java.util.Scanner;

public class CountAllSubsequenceWithSizeK {
	public static int countsubsequence(int i,int index,int n,int k){
		if(i==k) {
			return 1;
		}
		if(index==n)
			return 0;
		int pick=countsubsequence(i+1,index+1,n,k);
		int skip=countsubsequence(i,index+1,n,k);
		return pick+skip;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int res=countsubsequence(0,0,n,k);
	System.out.println(res);
}
}
