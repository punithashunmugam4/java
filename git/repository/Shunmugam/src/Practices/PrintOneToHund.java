package Practices;

public class PrintOneToHund {
	public static void printNumbers(int i,int n) {
		if(i>n) return;
		System.out.print(i+" ");
		printNumbers(i+1,n);
	}
public static void main(String []args) {
	printNumbers(1,100);
}
}
