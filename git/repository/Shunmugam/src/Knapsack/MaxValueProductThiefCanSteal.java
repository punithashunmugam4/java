package Knapsack;

import java.util.Arrays;
import java.util.Scanner;
//Knapsack
public class MaxValueProductThiefCanSteal {
	//bottomUp Approach
	public static int maxValueBottomUp(int n,int W,int wt[],int val[]) {
		int dp[][]=new int[n][W+1];
		for(int i=wt[0];i<=W;i++) {
			dp[0][i]=val[0];
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<=W;j++) {
				int notTaken=0+dp[i-1][j];
				int taken=Integer.MIN_VALUE;
				if(wt[i]<=j) {
					taken=val[i]+dp[i-1][j-wt[i]];
				}
				dp[i][j]=Math.max(notTaken, taken);
			}
		}
		return dp[n-1][W];
	}
	//Optmized Bottom Up
	public static int optimizedMaxValueBottomUp(int n,int W,int wt[],int val[]) {
		    int i, w;
		    int [][]K = new int[2][W + 1];
		    for (i = 1; i <= n; i++) {
		      for (w = 1; w <= W; w++) {
		        if (i == 0 || w == 0)
		          K[i % 2][w] = 0;
		        else if (wt[i - 1] <= w)
		          K[i % 2][w] = Math.max(val[i - 1] + K[(i - 1) % 2][w - wt[i - 1]], K[(i - 1) % 2][w]);
		        else
		          K[i % 2][w] = K[(i - 1) % 2][w];
		      }
		    }
		    return K[n % 2][W];
	}
	public static int MemoryoptimizedMaxValueBottomUp(int n,int W,int wt[],int val[]) {
		int dp[]=new int[W+1];
		 for (int i = 1; i <= n; i++) {
		      for (int w = W; w >= 0; w--) {
		 
		        if (wt[i - 1] <= w)
		           
		          // finding the maximum value
		          dp[w] = Math.max(dp[w],dp[w - wt[i - 1]] + val[i - 1]);
		      }
		    }
		 return dp[W];
	}
	//TopDown Approach
	public static int findMaxValue(int n,int W,int wt[],int val[],int dp[][]) {
		if(n==0) {
			if(wt[n]<=W) return val[n];
			else return 0;
		}
		if(dp[n][W]!=-1) return dp[n][W];
		int notTaken=0+findMaxValue(n-1,W,wt,val,dp);
		int taken=Integer.MIN_VALUE;	
		if(wt[n]<=W)
		taken=val[n]+findMaxValue(n-1,W-wt[n],wt,val,dp);
		return dp[n][W]=Math.max(notTaken, taken);
	}
	public static int maxValue(int n,int W,int wt[],int val[]) {
		int dp[][]=new int[n][W+1];
		for(int row[] : dp)
			Arrays.fill(row,-1);
		return findMaxValue(n-1,W,wt,val,dp);
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int W=sc.nextInt();//maximum capacity of bag
	int wt[]=new int[n];
	int val[]=new int[n];
	for(int i=0;i<n;i++)
		val[i]=sc.nextInt();
	for(int i=0;i<n;i++)
		wt[i]=sc.nextInt();
	int res=maxValue(n,W,wt,val);
	System.out.println(res);
	int res1=maxValueBottomUp(n,W,wt,val);
	System.out.println(res);
	int res2=optimizedMaxValueBottomUp(n,W,wt,val);
	System.out.println(res2);
	int res3=MemoryoptimizedMaxValueBottomUp(n,W,wt,val);
	System.out.println(res3);
}
}
