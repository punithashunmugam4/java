package Basics;

public class NthUglyNumber {
	private static int maxDivide(int x,int i) {
		while(i%x==0) {
			i=i/x;
		}
		return i;
	}
	public static int isUgly(int i) {
		i=maxDivide(2,i);
		i=maxDivide(3,i);
		i=maxDivide(5,i);
		return i==1 ? 1:0;
	}
	public static int NthUglyNo(int n) {
		int i=1,count=1;
		while(n>count) {
			i++;
			if(isUgly(i)==1)
				count++;
		}
		return i;
	}
public static void main(String []args) {
	System.out.println(NthUglyNo(150));
}
}
