package Recursion;

public class MinimunNumberOfWaysToReachNthStair {
	public static int minimumWays(int n) {
//		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		return minimumWays(n-1)+minimumWays(n-2);
	}
public static void main(String []args) {
	int n=5;
	int res=minimumWays(n);
	System.out.println(res);
}
}
