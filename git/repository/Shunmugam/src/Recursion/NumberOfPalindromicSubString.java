package Recursion;

import java.util.Arrays;

public class NumberOfPalindromicSubString {
	public static int numberOfPalindromicSubstring(char[] str,int n) {
		int dp[][]=new int[n][n];
		boolean flag[][]=new boolean[n][n];
		for(int i=0;i<n;i++) {
			flag[i][i]=true;
		}
		for(int i=0;i<n-1;i++) {
			if(str[i]==str[i+1]) {
				flag[i][i+1]=true;
				dp[i][i+1]=1;
			}
		}
		for(int k=2;k<n;k++) {
			for(int i=0;i<n-k;i++) {
				int j=k+i;
				if(str[i]==str[j] && flag[i+1][j-1])
					flag[i][j]=true;
				if(flag[i][j])
					dp[i][j]=dp[i][j-1]+dp[i+1][j]+1-dp[i+1][j-1];
				else
					dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
			}
		}
		return dp[0][n-1];
	}
	public static boolean isPalindrome(char[] str,int  i,int j) {
		if(i>j) return true;
		if(flag[i][j]) return flag[i][j];
		if(str[i]!=str[j]) return flag[i][j]=false;
		return flag[i][j]=isPalindrome(str,i+1,j);
	}
	public static int topDownPSubString(char[] str,int l,int r) {
		if(l>r) return 0;
		if(l==r) return 1;
		if(dp[l][r]!=-1) return dp[l][r];
		if(isPalindrome(str,l,r)) 
			return dp[l][r]=topDownPSubString(str,l+1,r)+topDownPSubString(str,l,r-1)+1-topDownPSubString(str,l+1,r-1);
		else 
			return dp[l][r]=topDownPSubString(str,l+1,r)+topDownPSubString(str,l,r-1)-topDownPSubString(str,l+1,r-1);
	}
	public static int findPalindromeInSubstring(String str,int i,int j) {
		int count=0;
		for(;i>=0 && j<str.length();i-- , j++) {
			if(str.charAt(i)!=str.charAt(j)) break;
			 System.out.println(str.substring(i, j+1));
			count++;
		}
		return count;
	}
	public static int recursive(String str,int n) {
		int count=0;
			for(int i=0;i<n;i++) {
			count+=findPalindromeInSubstring(str,i-1,i+1);
			count+=findPalindromeInSubstring(str,i,i+1);
			}
			return count;
	}
	private static boolean isPal(char[] str,int i,int j) {
		while(j>i) {
			if(str[i++]!=str[j--]) return false;
		}
		return true;
	}
	public static int naive(char[] str,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(isPal(str,i,j)) count++;
			}
		}
		return count;
	}
	static int dp[][]=new int[100][100];
	static boolean flag[][]=new boolean[100][100];
public static void main(String []args) {
	String str="aaa";
	for(int row[]:dp)
	Arrays.fill(row, -1);
	for(boolean row[]:flag)
	Arrays.fill(row, false);
	int res1=numberOfPalindromicSubstring(str.toCharArray(),str.length());
	System.out.println(res1+str.length());
	int res=topDownPSubString(str.toCharArray(),0,str.length()-1);
	System.out.println(res);
	System.out.println(naive(str.toCharArray(),str.length()));
	System.out.println(recursive(str,str.length()));
}
}
