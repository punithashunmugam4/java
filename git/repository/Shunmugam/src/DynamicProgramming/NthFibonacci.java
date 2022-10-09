package DynamicProgramming;

import java.util.Arrays;
//Top dowm Approach
public class NthFibonacci {
	static int dp[];
	public static int printfibonacci(int n) {
		if(n==0) {
			System.out.print(0+" "+1+" ");
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(dp[n]!=-1) return dp[n];
		dp[n]=printfibonacci(n-1)+printfibonacci(n-2);
		System.out.print(dp[n]+" ");
		return dp[n];
	}
//	public static int fibonacci(int n) {
//		if(n==0) return 0;
//		if(n==1) return 1;
//		if(dp[n]!=-1) return dp[n];
//		dp[n]=fibonacci(n-1)+fibonacci(n-2);
//		return dp[n];
//	}
	public static void main(String []args) {
		int n=6;
		dp=new int[n+1];
		Arrays.fill(dp, -1);
//		int res=fibonacci(n);
//		System.out.println(res);
		printfibonacci(n);
//		System.out.println(result);
	}
}
//public class NthFibonacci {
//	public static int fibonacci1(int n) {
//		if(n==0) return 0;
//		if(n==1) return 1;
//		int prev=0;
//		int prev1=1;
//		int curr;
//		for(int i=2;i<=n;i++) {
//			curr=prev+prev1;
//			prev=prev1;
//			prev1=curr;
//		}
//		return prev1;
//	}
//	public static int fibonacci(int n) {
//		int arr[]=new int[n+1];
//		arr[0]=0;
//		arr[1]=1;
//		for(int i=2;i<=n;i++) {
//			arr[i]=arr[i-1]+arr[i-2];
//		}
//		return arr[n];
//	}
//	public static void main(String []args) {
//		int n=6;
//		int res=fibonacci(n);
//		System.out.println(res);
//	}
//}
