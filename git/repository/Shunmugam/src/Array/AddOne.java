package Array;

import java.util.*;

public class AddOne {
	public static int[] addOne(int arr[], int n) {
		if(n==0 || arr==null) {
			int temp[]= {1};
			return temp;
		}
		int carry=1;
		int i=0;
		for(i=n-1;i>=0;i--) {
			if(arr[i]==9) {
				arr[i]=0;
			}
			else {
				carry+=arr[i];
				arr[i]=carry;
				break;
			}
		}
		if(i<0) {
			int result[]=new int[n+1];
			result[0]=1;
			return result;
		}
		else
		return arr;
	}
	static int[] addone(int arr[],int n) {
		if(n==0 || arr==null) {
			int temp[]= {1};
			return temp;
		}
		int i=0;
		for(i=n-1;i>=0;i--) {
			if(arr[i]==9)
				arr[i]=0;
			else {
				arr[i]++;
			break;
			}
			
		}
		if(i<0) {
			int result[]=new int[n+1];
		result[0]=1;
		return result;
		}
		else
			return arr;
			
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int temp[]=addone(arr,n);
	for(int i=0;i<temp.length;i++)
	System.out.print(temp[i]+" ");
}
}
