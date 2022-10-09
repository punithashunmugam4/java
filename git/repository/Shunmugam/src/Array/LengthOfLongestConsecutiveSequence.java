package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfLongestConsecutiveSequence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	Arrays.sort(arr);
	int count=0,max=0;
	for(int i=0;i<n-1;i++) {
		int j=i+1;
		if(arr[j]==arr[i])
			continue;
		if(arr[j]==arr[i]+1) {
			count++;
			max=Math.max(count,max);
			j++;
		}
		else {
			count=0;
		}
	}
	System.out.println(max+1);
}
}
