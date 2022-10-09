package DynamicProgramming;

import java.util.Arrays;

public class Vowels {
	public static int numberOfString(int n,int start) {
		if(n==0) return 1;
		int count=0;
		for(int i=start;i<5;i++) {
		count+=numberOfString(n-1,i);
		}
		return count;
	}
	public static int numberOfString1(int n,int start) {
		if(n==0) return 1;
		if(start>=5) return 0;
		int count=numberOfString1(n-1,start);
		count+=numberOfString1(n,start+1);
		return count;
	}
	public static int dynamic(int n) {
		int dp[][]=new int[n+1][6];
		for(int row[]:dp)
		Arrays.fill(row, -1);
		return numberOfStringDp(n,0,dp);
	}
	public static int numberOfStringDp(int n,int start,int dp[][]) {
		if(n==0) return 1;
		if(start>=5) return 0;
		if(dp[n][start]!=-1) return dp[n][start];
		int count=numberOfString1(n-1,start);
		dp[n][start]=count+numberOfString1(n,start+1);
		return dp[n][start];
	}
public static void main(String []args) {
	int n=3;
	System.out.println(numberOfString(n,0));
	System.out.println(numberOfString1(n,0));
	System.out.println(dynamic(n));
	}
}
