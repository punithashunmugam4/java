package Recursion;

public class NumberOfWaysTofillArrayWithZeroAndOne {
	public static int numberOfWays(int index,int n,boolean prev) {
		int total=0;
		if(index>n) {
			return 1;
		}
		total+=numberOfWays(index+1,n,false);
		if(prev==false)
		total+=numberOfWays(index+1,n,true);
		return total;
	}
public static void main(String[] args) {
	int n=3;
//	for(int i=1;i<10;i++) {
	int res=numberOfWays(1,n,false);
	System.out.println(res);
//	}
}
}
