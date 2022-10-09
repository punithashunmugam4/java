package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class GridPath {
	//Top down approach
	public static int numberOfWays(int m,int n,int[][] dp) {
		if(m==0 && n==0)  return 1;
		if(m<0 || n<0)    return 0;
		if(dp[m][n]!=-1)  return dp[m][n];
		int up=numberOfWays(m-1,n,dp);
		int left=numberOfWays(m,n-1,dp);
		return dp[m][n]=up+left;
	}
	public static int doSolveGridPath(int m,int n){
		int dp[][]=new int[m][n];
		for(int row[] : dp)
		Arrays.fill(row	, -1);
//		return numberOfWays(m-1,n-1,dp);
		return numberOfWaysBottomUp(m,n,dp);
	}
	//bottom up approach
	public static int numberOfWaysBottomUp(int m,int n,int[][] dp) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j==0) {
					dp[0][0]=1;
					continue;
				}
				int down=0;
				int right=0;
				if(i>0)  down=dp[i-1][j];
				if(j>0)  right=dp[i][j-1];
				dp[i][j]=down+right;
			}
		}
		return dp[m-1][n-1];
	}
public static void main(String []args) {
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();
int res=doSolveGridPath(M,N);
System.out.println(res);
}
}
