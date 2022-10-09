package Basics;
import java.util.Scanner;

public class Dice {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int s=sc.nextInt();
		int ans=7-s;
		System.out.println(ans);
	}
}
}
