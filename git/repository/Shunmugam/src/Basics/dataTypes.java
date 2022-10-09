package Basics;
import java.util.Scanner;

public class dataTypes {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	float f=sc.nextFloat();
	long l=sc.nextLong();
	double d=sc.nextDouble();
	String s=sc.next();
	char c=sc.next().charAt(0);
	System.out.println("Integer:"+i+"\nFloat:"+f+"\nLong:"+l+"\nDouble:"+d+"\nString:"+s+"\nchar"+c);
}
}