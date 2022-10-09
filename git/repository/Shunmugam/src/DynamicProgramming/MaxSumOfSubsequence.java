package DynamicProgramming;

import java.util.Arrays;

/*MAximum sum of subsequence 
 * note: adjacent elements should not be taken
 */
public class MaxSumOfSubsequence {
	//Top down Approach
	public static int dosolve(int index,int arr[],int n,int dp[]) {
		if(index==0) {
			return arr[index];
		}
		if(index<0)
			return 0;
		if(dp[index]!=-1)
			return dp[index];
		int pick=arr[index]+dosolve(index-2,arr,n,dp);
		int skip=0+dosolve(index-1,arr,n,dp);
		return dp[index]=Math.max(skip, pick);
	}
	public static int maxsum(int arr[],int n) {
		int dp[]=new int[n];
		Arrays.fill(dp, -1);
		return dosolve(n-1,arr,n,dp);
	}
	//Bottom up Approach
	public static int maxsumBottomUp(int arr[],int n) {
		int dp[]=new int[n];
		Arrays.fill(dp, -1);
		dp[0]=arr[0];
		for(int i=1;i<n;i++) {
			int pick=arr[i];
			if(i>1)
			pick+=dp[i-2];
			int skip=0+dp[i-1];
			dp[i]=Math.max(skip,pick);
		}
		return dp[n-1];
	}
public static void main(String []args) {
	int arr[]= {1,2,4,9};
	int n=arr.length;
	System.out.println(maxsum(arr,n));
	System.out.println(maxsumBottomUp(arr,n));
}
}
