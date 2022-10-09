package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubstring {
	public static void printLongestCommonSubstring(String str,String str1,int n,int m) {
		int ans=0;
		int dp[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(str.charAt(i-1)==str1.charAt(j-1)) {
					System.out.print(str.charAt(i-1)+" ");
					int val=1+dp[i-1][j-1];
					dp[i][j]=val;
					ans=Math.max(ans, val);
				}
				else dp[i][j]=0;
			}
		}
	}
	public static int longestCommonSubstring(String str,String str1,int n,int m) {
		int ans=0;
		int dp[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(str.charAt(i-1)==str1.charAt(j-1)) {
					int val=1+dp[i-1][j-1];
					dp[i][j]=val;
					ans=Math.max(ans, val);
				}
				else dp[i][j]=0;
			}
		}
		return ans;
	}
	public static int longestCommonSubstring(String str,String str1,int n,int m,int count) {
		if(n==0 || m==0)
			return count;
		if(str.charAt(n-1)==str1.charAt(m-1)) {
			 count=longestCommonSubstring(str,str1,n-1,m-1,count+1);
		}
			int count1=longestCommonSubstring(str,str1,n-1,m,0);
			int count2=longestCommonSubstring(str,str1,n,m-1,0);
		
	return count=Math.max(count,Math.max(count1, count2));
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String str1=sc.next();
	int n=str.length();
	int m=str1.length();
	int res=longestCommonSubstring(str,str1,n,m,0);
	System.out.println(res);
	int res1=longestCommonSubstring(str,str1,n,m);
	System.out.println(res1);
	printLongestCommonSubstring(str,str1,n,m);
	}
}

