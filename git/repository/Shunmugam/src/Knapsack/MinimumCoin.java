package Knapsack;

import java.util.Arrays;
//Knapsack
public class MinimumCoin {
	//TopDown Approach
	public static int findMinCoins(int idx,int []deno,int target,int dp[][]) {
		if(idx==0) {
			if(target%deno[idx]==0)
				return target/deno[idx];
			else
				return (int)Math.pow(10, 9);
		}
		if(dp[idx][target]!=-1) return dp[idx][target];
		int notTaken=0+findMinCoins(idx-1,deno,target,dp);
		int taken=(int)Math.pow(10, 9);
		if(deno[idx]<=target)
			taken=1+findMinCoins(idx-1,deno,target-deno[idx],dp);
		return dp[idx][target]=Math.min(notTaken, taken);
	}
	public static int findMinCoinsbyTopDown(int []deno,int n,int target) {
		int dp[][]=new int[n][target+1];
		for(int row[]:dp)
			Arrays.fill(row, -1);	
		return findMinCoins(n-1, deno, target, dp);
	}
	//Bottom UpApproach Tabulation
	public static int findMinCoinsbyBottomUP(int idx,int []deno,int target) {
		int dp[][]=new int[idx][target+1];
		for(int i=0;i<idx;i++) {
			dp[i][0]=0;
		}
		for(int i=0;i<=target;i++) {
			dp[0][i]=i;
		}
		/*Both are possible*/
//		for(int i=0;i<=target;i++) {
//			if(target % deno[0]==0)
//				dp[0][i]=target/deno[0];
//			dp[0][i]=i;
//		}
		for(int i=1;i<idx;i++) {
			for(int j=1;j<=target;j++) {
				int notTaken=0+dp[i-1][j];
				int taken=(int)Math.pow(10, 9);
				if(deno[i]<=j) {
						taken=1+dp[i-1][j-deno[i]];
				}
				dp[i][j]=Math.min(notTaken, taken);
			}
		}
		return dp[idx-1][target];
	}
	// Bottom Up approach with 1D dp
	public static int findMinCoinsBottomUp1D(int idx,int deno[],int target) {
		int prev[]=new int[target+1];
		for(int i=0;i<=target;i++) {
			if(target % deno[0]==0)
			prev[i]=target/deno[0];
			else
				prev[i]=i;
		}
		for(int i=1;i<idx;i++) {
			for(int j=1;j<=target;j++) {
				int notTaken=0+prev[j];
				int taken=Integer.MAX_VALUE;
				if(deno[i]<=j) {
				taken=1+prev[j-deno[i]];
				}
				prev[j]=Math.min(notTaken, taken);
			}
		}
		return prev[target];
	}
public static void main(String[] args) {
	int denomination[] = {9,6,5,1};
    int n = denomination.length;
    int target = 11;
    System.out.println("Minimum number of coins to form target :: "+findMinCoinsbyTopDown(denomination, n, target));
    System.out.println("Minimum number of coins to form target :: "+findMinCoinsbyBottomUP(n,denomination,target));
    System.out.println("Minimum number of coins:"+findMinCoinsBottomUp1D(n,denomination,target));
}
}
