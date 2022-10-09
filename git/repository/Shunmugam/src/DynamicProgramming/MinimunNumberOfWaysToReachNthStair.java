package DynamicProgramming;

import java.util.Arrays;

public class MinimunNumberOfWaysToReachNthStair {
	static int dp[];
	public static int minimumWays(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		if(dp[n]==-1)
			dp[n]=minimumWays(n-1)+minimumWays(n-2);
		return dp[n];
	}
	public static void main(String []args) {
		int n=5;
		dp=new int[n+1];
		Arrays.fill(dp,-1);
		int res=minimumWays(n);
		System.out.println(res);
		int result=minimumWays1(n);
		System.out.println(result);
	}
	//bottom up Approach
	public static int minimumWays1(int n) {
		int arr[]=new int[n+1];
		arr[1]=1;
		arr[2]=2;
		for(int i=3;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
}
