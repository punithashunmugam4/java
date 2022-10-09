package DynamicProgramming;

import java.util.Arrays;

public class NumberOfWaystoReachNthStair {
	static int memo[];
	public static int numberOfWays(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		if(memo[n]==0)
			memo[n]=numberOfWays(n-1)+numberOfWays(n-2)+numberOfWays(n-3);
		return memo[n];
	}
public static void main(String []args) {
	int n=5;
	memo=new int[n+1];
	Arrays.fill(memo, 0);
	int res=numberOfWays(n);
	System.out.println(res);
	int result=numberOfWays(n);
	System.out.println(result);
}
//bottom up approach
public static int NumberOfWaystoReachNthStair1(int n) {
	if(n==0) return 1;
	if(n==1) return 1;
	if(n==2) return 2;
	int arr[]=new int[n+1];
	for(int i=3;i<n;i++) {
		arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
	}
	return arr[n];
}
}
