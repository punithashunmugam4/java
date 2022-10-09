package Basics;
import java.util.Scanner;

public class Clinic {
	public static int waitingTime(int n,int x) {
		if(x>=10)
			return 0;
		int a=10*(n-1);
		int b=(n-1)*x;
		int ans=a-b;
		//which can written as (n-1)(10-x)
		return ans;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++) {
		int n=sc.nextInt();
		int x=sc.nextInt();
		System.out.println(waitingTime(n,x));
		
	}
}
}
