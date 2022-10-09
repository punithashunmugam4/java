package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubsequence {
	public static int longestCommonSubsequence(String str1,String str2,int n,int m) {
		if(n==0 || m==0) {
			return 0;
		}
		if(str1.charAt(n-1)==str2.charAt(m-1))
			return 1+longestCommonSubsequence(str1,str2,n-1,m-1);
		return Math.max(longestCommonSubsequence(str1,str2,n-1,m),longestCommonSubsequence(str1,str2,n,m-1));
	}
	public static int lcsTopDown(String str1,String str2,int n,int m,int dp[][]) {
		if(n==0 || m==0) {
			return 0;
		}
		if(dp[n][m]!=-1)
			return dp[n][m];
		if(str1.charAt(n-1)==str2.charAt(m-1))
			return dp[n][m]=1+lcsTopDown(str1,str2,n-1,m-1,dp);
		return dp[n][m]=Math.max(lcsTopDown(str1,str2,n-1,m,dp),lcsTopDown(str1,str2,n,m-1,dp));
	}
public static int longestCommonSubsequenceTopDown(String str1,String str2,int n,int m) {
	int dp[][]=new int[n+1][m+1];
	for(int row[]:dp) {
		Arrays.fill(row, -1);
	}
	return lcsTopDown(str1,str2,n,m,dp);
}
public static int lcsBottomUp(String str1,String str2,int n,int m) {
	int dp[][]=new int[n+1][m+1];
	for(int i=0;i<=m;i++)
		dp[0][i]=0;
	for(int i=0;i<=n;i++)
		dp[i][0]=0;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			if(str1.charAt(i-1)==str2.charAt(j-1))
				dp[i][j]=1+dp[i-1][j-1];
			else {
				dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
	}
	return dp[n][m];
}
public static void printLongestCommonSubsequence(String str1,String str2,int n,int m) {
	int dp[][]=new int[n+1][m+1];
	for(int row[]:dp) {
		Arrays.fill(row, -1);
	}
	int index=lcsTopDown(str1,str2,n,m,dp);
	int temp=index;
	char lcs[]=new char[index+4];
	int i=n,j=m;
	while(i>0 && j>0) {
		if(str1.charAt(i-1)==str2.charAt(j-1)) {
			lcs[index-1]=str1.charAt(i-1);
			index--;
			i--;
			j--;
		}
		else if(dp[i-1][j]>dp[i][j-1])
			i--;
		else
			j--;
	}
	for(char c:lcs)
	System.out.print(c+" ");
}
public static int optimizedLcsBottomUp(String str1,String str2,int n,int m) {
	int prev[]=new int[m+1];
	int curr[]=new int[m+1];
	Arrays.fill(prev,0);
	Arrays.fill(curr,0);
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			if(str1.charAt(i-1)==str2.charAt(j-1))
				curr[j]=1+prev[j-1];
			else
				curr[j]=Math.max(prev[j],curr[j-1]);
		}
		prev=curr;
	}
	return prev[n];
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	String str2=sc.next();
	int n=str1.length();
	int m=str2.length();
	System.out.println(longestCommonSubsequence(str1,str2,n,m));
	System.out.println(longestCommonSubsequenceTopDown(str1,str2,n,m));
	System.out.println(lcsBottomUp(str1,str2,n,m));
//	System.out.println(optimizedLcsBottomUp(str1,str2,n,m));
	printLongestCommonSubsequence(str1,str2,n,m);
}
}
