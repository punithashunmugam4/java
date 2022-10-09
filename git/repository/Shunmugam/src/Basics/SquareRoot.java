package Basics;

import java.util.Scanner;

public class SquareRoot {
	public static double squareRoot(int n) {
		double num=n/2;
		double temp;
		do {
			temp=num;
			num=(temp+(n/temp))/2;
		}while((temp-num)!=0);
		return num;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(squareRoot(n));
}
}
