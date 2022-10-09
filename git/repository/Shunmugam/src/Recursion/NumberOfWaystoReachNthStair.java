package Recursion;

public class NumberOfWaystoReachNthStair {
	public static int numberOfWays(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		return numberOfWays(n-1)+numberOfWays(n-2)+numberOfWays(n-3);
	}
public static void main(String []args) {
	int n=5;
	int res=numberOfWays(n);
	System.out.println(res);
}
}
