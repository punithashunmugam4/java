package Practices;

public class BinaryToDecimal {
	public static int convertBinaryToDecimal(int a) {
		int i=0;
		int sum=0;
		while(a>0) {
		int val=a%10;
		sum+=val*Math.pow(2,i++);
		a=a/10;
		}
		return sum;
	}
	public static int convertBinaryToDecimalRecur(int a,int i,int sum) {
		if(a==0) return sum;
		int val=a%10;
		sum+=val*Math.pow(2,i);
		return convertBinaryToDecimalRecur(a/10,i+1,sum);
	}
public static void main(String []args) {
	int binary=10111;
	 System.out.println(convertBinaryToDecimal(binary));
	 System.out.println(convertBinaryToDecimalRecur(binary,0,0));
}
}