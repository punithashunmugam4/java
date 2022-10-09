package DynamicProgramming;

public class Maxjumps{
	public static int findmaxjumps(int n) {
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3) return 4;
		int res=findmaxjumps(n-1)+findmaxjumps(n-2)+findmaxjumps(n-3);
		return res;
	}
public static void main(String []args) {
	int n=5;
	System.out.print(findmaxjumps(n));
	
}
}
