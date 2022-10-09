package Basics;
import java.util.Scanner;

public class GcdPairs {
public static int gcd(int n,int m) {
	if(n==m)
		return n;
	if(n>m)
	return gcd(n-m,m);
	return gcd(n,m-n);
}
public static void main(String []args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int max=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i!=j) {
				max=Math.max(max,gcd(arr[i],arr[j]));
				
			}
		}
	}
	System.out.println(max);
}
}
