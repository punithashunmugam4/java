package Practices;

import java.util.Arrays;

public class NumberOfPalindromicSubstring {
	public static int findnuOfPs(String str,int j,int i) {
		int count=0;
		while(i<str.length() && j>=0) {
			if(str.charAt(i)!=str.charAt(j)) break;
			count++;
			System.out.println(str.substring(j,i+1));
			i++;
			j--;
		}
		return count;
	}
	public static int findNumberOfPalindromicSubstring (String str,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			count+=findnuOfPs(str,i-1,i+1);
			count+=findnuOfPs(str,i,i+1);
		}
		return count+str.length();
	}
	static int dp[][];
	static boolean flag[][];
	private static boolean isPalindromedp(char[] str,int i,int j) {
		if(i>j) {
			return true;
		}
		if(flag[i][j]) return flag[i][j]=true;
		if(str[i]!=str[j])
			return flag[i][j]=false;
		return flag[i][j]=isPalindromedp(str,i+1,j-1);
	}
	public static int topDownPSubstring(char[] str,int i,int j) {
		if(i>j) {
			return 0;
		}
		if(i==j) return 1;
		if(dp[i][j]!=-1)
			return dp[i][j];
		else if(isPalindromedp(str,i,j)) {
			return dp[i][j]=topDownPSubstring(str,i+1,j)+topDownPSubstring(str,i,j-1)+1-topDownPSubstring(str,i+1,j-1);
		}
			else
			return dp[i][j]=topDownPSubstring(str,i+1,j)+topDownPSubstring(str,i,j-1)-topDownPSubstring(str,i+1,j-1);
	}
	public static int dpsolution(char[] str,int n) {
		dp=new int[n][n];
		flag=new boolean[n][n];
		for(int row[]:dp)
			Arrays.fill(row, -1);
		for(boolean row[]:flag)
			Arrays.fill(row, false);
		return topDownPSubstring(str,0,n-1);
	}
public static void main(String []args) {
	String str="aabaa";
	for(int i=0;i<str.length();i++)
		System.out.println(str.charAt(i));
	System.out.println(findNumberOfPalindromicSubstring(str,str.length()));
	System.out.println(dpsolution(str.toCharArray(),str.length()));
}
}
