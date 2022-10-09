package DynamicProgramming;

import java.util.Arrays;

public class NumberOfWaysTofillArrayWithZeroAndOne {
	static int dp[];
	public static int numberOfWays(int n) {
		if(n==0) return 1;
		if(n==1) return 2;
		if(dp[n]!=-1)
			return dp[n];
		dp[n]=numberOfWays(n-1)+numberOfWays(n-2);
		return dp[n];
	}
	public static void main(String[] args) {
		int n=3;
		dp=new int[n+1];
		Arrays.fill(dp, -1);
		int res=numberOfWays(n);
		System.out.println(res);
		int result=numberOfWays1(n);
		System.out.println(result);
	}
	//bottom up Approach
	public static int numberOfWays1(int n) {
		int arr[]=new int[n+1];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
}
