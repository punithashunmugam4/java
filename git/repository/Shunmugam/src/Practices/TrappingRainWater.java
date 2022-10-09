package Practices;

public class TrappingRainWater {
	public static int trapped(int arr[],int n) {
		int l[]=new int[n];
		int r[]=new int[n];
		
		l[0]=arr[0];
		for(int i=1;i<n;i++) {
			l[i]=Math.max(l[i-1], arr[i]);
		}
		
		r[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			r[i]=Math.max(r[i+1], arr[i]);
		}
		int water=0;
		for(int i=0;i<n;i++) {
			water+=Math.min(l[i], r[i])-arr[i];
		}
		return water;
	}
	// T.C: O(N)
	// S.C: O(N)
	public static int trappedAnother(int arr[],int n) {
		int l=0,r=n-1;
		int l_max=0,r_max=0;
		int result=0;
		while(l<=r) {
			if(l_max<=r_max) {
				result+=Math.max(0, l_max-arr[l]);
				l_max=Math.max(l_max,arr[l]);
				l++;
			}
			else {
				result+=Math.max(0, r_max-arr[r]);
				r_max=Math.max(r_max,arr[r]);
				r--;
			}
		}
		return result;
	}
	// T.C: O(N)
	// S.c: O(1)
public static void main(String []args) {
	int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
	int n=arr.length;
	System.out.println(trapped(arr,n));
	System.out.println(trappedAnother(arr,n));
}
}
