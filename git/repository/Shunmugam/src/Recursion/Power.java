package Recursion;

public class Power {
	public static int findPower(int x,int n) {
		if(n==1) return x;
		if(n==0) return 1;
		if(x==0) return 0;
		return x*findPower(x,n-1);
	}
	// T.C:O(N)
	// S.C:O(N) Auxillary space
	public static int findPower1(int x,int n) {
		if(n==1) return x;
		if(n==0) return 1;
		if(x==0) return 0;
		return findPower(x,(n+1)/2)*findPower(x,(n)/2);
	}
	// T.C:O(logN)
	// S.C:O(logN) Auxillary space
public static void main(String []args) {
	int x=2;
	int n=8;
	System.out.println(findPower(x,n));
	System.out.println(findPower1(x,n));
}
}
