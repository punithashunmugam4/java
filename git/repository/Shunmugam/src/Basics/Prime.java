package Basics;

import java.util.Scanner;
//if a number does not have any factor within its sqrt then after the sqrt also
//it does not have factor
public class Prime {
	static boolean checkforPrime(int n) {
		if(n==0) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(checkforPrime(n))
		System.out.println("Given number is Prime");
	else
		System.out.println("Not prime");
}
}
