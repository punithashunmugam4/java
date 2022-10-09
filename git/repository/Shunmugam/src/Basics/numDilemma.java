package Basics;
import java.util.Scanner;

public class numDilemma {
	public static String toString(int n) {
//		String s=Integer.toString(n);
		String s=String.valueOf(n);
		return s;
	}
	public static int toInteger(String n) {
		int i=Integer.parseInt(n);
		return i;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="2";
		System.out.println(toInteger(str));
		System.out.println(toString(n));
		
	}
}
