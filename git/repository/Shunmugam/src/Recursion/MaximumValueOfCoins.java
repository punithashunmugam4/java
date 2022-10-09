package Recursion;

import java.util.Scanner;
/*You are given an array of N numbers, the numbers represent value of coin and 
 * you are required to collect some coins from the array. But there is one condition,
 *  if you take the coin at index i, you cannot take the coin at index (i-1) & (i+1).
Tell the maximum sum value of coins that you can collect from the array.
Sample input
5
1 2 3 4 5
Sample output
9
*/
public class MaximumValueOfCoins {
	static int dp[][];
	public static int maximumValue(int arr[],int n) {
		if (n == 1) {
		      return arr[0];
		    }
		dp[0][0]=0;
		dp[0][1]=arr[0];
		for(int i=1;i<n;i++) {
			dp[i][1]=dp[i-1][0]+arr[i];
			dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
		}
		return Math.max(dp[n-1][0],dp[n-1][1]);
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	dp=new int[n][2];
	int max=maximumValue(arr,n);
	System.out.println(max);
}
}
