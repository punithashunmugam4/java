package Recursion;

public class NthFibonacci {
	static int fibonacci(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		int res=fibonacci(n-1)+fibonacci(n-2);
		return res;
	}
	static void fibonacci1(int n){
		int first=0,second=1;
		int i=2,fib=0;
		System.out.print(first+" "+second+" ");
		while(i<n) {
			fib=first+second;
			first=second;
			second=fib;
			System.out.print(fib+" ");
			i++;
		}
	}
		static void fibonacci2(int n,int first,int second){
			if(n<=2) {
				return;
			}
			int fib=first+second;
				System.out.print(fib+" ");
				fibonacci2(n-1,second,fib);
	}
public static void main(String []args) {
	int n=6;
	int res=fibonacci(n);
	System.out.println(res);
	fibonacci1(n);
	System.out.println();
	int first=0,second=1;
	System.out.print(first+" "+second+" ");
	fibonacci2(n,first,second);
}
}
