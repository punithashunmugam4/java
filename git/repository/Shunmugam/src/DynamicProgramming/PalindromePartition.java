package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
//palindrome partition
public class PalindromePartition {
	//BottomUp Approach
	public static int palindromePartitionBottomUp(String str) {
		int n=str.length();
		int dp[]=new int[n+1];
		dp[n]=0;
		for(int i=n-1;i>=0;i--) {
			int mincost=Integer.MAX_VALUE;
			for(int j=i;j<n;j++) {
				if(palindrome(str,i,j)) {
					int cost=1+dp[j+1];
					mincost=Math.min(mincost, cost);
				}
			}
			dp[i]=mincost;
		}
		return dp[0];
	}
	//TopDown Approach
	public static int palindromePartitionDp(String str,int n,int i,int dp[]) {
		if(i==n) return 0;
		if(dp[i]!=-1) return dp[i];
		int mincost=Integer.MAX_VALUE;
		for(int j=i;j<n;j++) {
			if(palindrome(str,i,j)) {
				int cost=1+palindromePartitionDp(str,n,j+1,dp);
				mincost =Math.min(mincost, cost);
			}
		}
	return dp[i]=mincost;
		
	}
	//Recursive method
	public static int palindromePartition(String str,int n,int i,int cost) {
		if(i==n)
			return 0;
			int mincost=Integer.MAX_VALUE;
			for(int j=i;j<n;j++) {
				if(palindrome(str,i,j)) {
					cost=1+palindromePartition(str,n,j+1,cost);
				}
				mincost =Math.min(mincost, cost);
			}
		return mincost;
	}
	public static boolean palindrome(String str,int i,int j) {
	    while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int n=str.length();
	int res=palindromePartition(str,n,0,0);
	System.out.println(res-1);
	int dp[]=new int[n+1];
	Arrays.fill(dp,-1);
	int res1=palindromePartitionDp(str,n,0,dp);
	System.out.println(res1-1);
	int res2=palindromePartitionBottomUp(str);
	System.out.println(res2-1);
}
}
