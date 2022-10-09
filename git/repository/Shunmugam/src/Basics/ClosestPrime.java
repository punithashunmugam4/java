package Basics;
import java.util.Scanner;

public class ClosestPrime {
	public static boolean isPrime(int n) {
		if(n==2 || n==3)
			return true;
		else
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)
					return false;
			}
		return true;
	}
	public static int closestPrime(int n) {
		int a=0,b=0;
		if(n==1) {
			return 2;
		}
		if(n>1) {
		for(int i=n;i>1;i--) {
			if(isPrime(i)) {
				a=i;
			break;
			}
		}
		for(int i=n;i<n+a;i++) {
			if(isPrime(i)) {
				b=i;
				break;
			}
		}
		}
		int ans1=n-a;
		int ans2=b-n;
		if(ans1>ans2)
			return b;
		return a;
		}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(closestPrime(n));
		}

}
