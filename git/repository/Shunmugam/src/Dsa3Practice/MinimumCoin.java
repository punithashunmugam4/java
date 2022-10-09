package Dsa3Practice;

import java.util.Arrays;

public class MinimumCoin {
	public static int recursiveWay(int n,int k,int deno[]) {
		if(n==0) {
			if(k%deno[n]==0) return k/deno[n];
			return (int)Math.pow(10, 9);
		}
		int notTaken=0+recursiveWay(n-1,k,deno);
		int taken=(int)Math.pow(10, 9);
		if(deno[n]<=k)
			taken=1+recursiveWay(n-1,k-deno[n],deno);
		return Math.min(taken, notTaken);
	}
	public static int doSolveMinCoin(int n,int k,int deno[],int dp[]) {
		if(n==0) {
			if(k%deno[n]==0) dp[n]= k/deno[n];
			return (int)Math.pow(10, 9);
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		int notTaken=0+recursiveWay(n-1,k,deno);
		int taken=(int)Math.pow(10, 9);
		if(deno[n]<=k)
			taken=1+recursiveWay(n-1,k-deno[n],deno);
		dp[n]=Math.min(taken, notTaken);
		return dp[n];
	}
	public static int dynamicMinCoin(int n,int k,int deno[]) {
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		return doSolveMinCoin(n-1,k,deno,dp);
	}
public static void main(String []args) {
	int denomination[] = {9,6,5,1};
    int n = denomination.length;
    int target = 11;
    System.out.println(recursiveWay(n-1,target,denomination));
    System.out.println(dynamicMinCoin(n,target,denomination));
}
}
