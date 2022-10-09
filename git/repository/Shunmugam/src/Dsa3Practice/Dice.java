package Dsa3Practice;

public class Dice {
	static int ways;
	public static int NoOfWays(int n,int sum) {
		if(n==0) {
			if(sum==0)
			return 1;
			return 0;
		}
		ways=0;
		for(int i=1;i<=6;i++) {
			ways+=NoOfWays(n-1,sum-i);
		}
		return ways;
	}
public static void main(String []args) {
	//Number of throws
	int n=2;
	//to get a sum
	int sum=10;
	System.out.println(NoOfWays(n,sum));
}
}
