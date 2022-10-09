package DynamicProgramming;

import java.util.Arrays;

public class TotalWaysCoinsToGetTarget {
	public static int findTotalWays(int deno[],int n,int target) {
		if(n==0) {
			if(target % deno[0]==0)
				return 1;
			return 0;
		}
		int notTaken=findTotalWays(deno,n-1,target);
		int taken=0;
		if(deno[n]<=target)
		taken=findTotalWays(deno,n,target-deno[n]);
		return taken+notTaken;
	}public static int findTotalWaysTopDown(int deno[],int n,int target,int dp[]) {
		if(n==0) {
			if(target % deno[0]==0)
				return 1;
			return 0;
		}
		if(dp[n]!=-1)
			return dp[n];
		int notTaken=findTotalWaysTopDown(deno,n-1,target,dp);
		int taken=0;
		if(deno[n]<=target)
		taken=findTotalWaysTopDown(deno,n,target-deno[n],dp);
		return dp[n-1]=taken+notTaken;
	}
	public static int findTotalWaysDp(int deno[],int n,int target) {
		int dp[]=new int[target+1];
		Arrays.fill(dp,-1);
		return findTotalWaysTopDown(deno,n,target,dp);
	}
public static void main(String []args) {
	int deno[]= {1,2,3};
	int n=deno.length;
	int target=4;
	System.out.println(findTotalWays(deno,n-1,target));
	System.out.println(findTotalWaysDp(deno,n-1,target));
}
}
