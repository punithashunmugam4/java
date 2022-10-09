package Array;

import java.util.Scanner;

public class Concatenation {
public static void main(String []args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int nums[]=new int[n];
	//getting input array nums[] of n size
	for(int i=0;i<n;i++) {
		nums[i]=sc.nextInt();
	}
//	duplicating nums[] array with concatination in ans[]
	int ans[]=new int[2*n];
	int j=0;
	for(int i=0;i<n;i++) {
		if(i<n)
		ans[i]=nums[j];
			ans[i+n]=nums[j];
			j++;
			
		}
	//printing the ans[] array which is concatinated
	for(int i=0;i<2*n;i++) 
		System.out.print(ans[i]+" ");
		
}
}
