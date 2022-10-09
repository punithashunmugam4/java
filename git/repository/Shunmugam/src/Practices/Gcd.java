package Practices;

public class Gcd {
	public static int gcd(int a,int b) {
		if(a==b) return a;
		if(a>b)
			return gcd(a-b,b);
		else
			return gcd(a,b-a);
	}
public static void main(String []args) {
	int a=54;
	int b=24;
System.out.println(gcd(a,b));
}
}
// 