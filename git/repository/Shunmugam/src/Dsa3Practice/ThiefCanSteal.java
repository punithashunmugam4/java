package Dsa3Practice;

import java.util.Scanner;

public class ThiefCanSteal {
	public static int recursiveWay(int n,int W,int wt[],int val[]) {
		if(n==0) {
			if(W<=wt[n])
			return val[n];
			return 0;
		}
		int notTaken=0+recursiveWay(n-1,W,wt,val);
		int taken=Integer.MIN_VALUE;
		if(W<=wt[n]) {
			taken=val[n]+recursiveWay(n-1,W-wt[n],wt,val);
		}
		return Math.max(notTaken, taken);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int W=sc.nextInt();//maximum capacity of bag
		int wt[]=new int[n];
		int val[]=new int[n];
		for(int i=0;i<n;i++)
			val[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			wt[i]=sc.nextInt();
		recursiveWay(n-1,W,wt,val);
	}
}
