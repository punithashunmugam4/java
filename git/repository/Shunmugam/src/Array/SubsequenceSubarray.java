package Array;

import java.util.Arrays;

public class SubsequenceSubarray {
	public static void subArray(int arr[],int start,int end) {
		if(end==arr.length)
			return;
		else if(start>end)
			subArray(arr,0,end+1);
		else {
			System.out.print("[");
			for(int i=start;i<end;i++) 
			System.out.print(arr[i]+",");
			System.out.println(arr[end]+"]");
			subArray(arr,start+1,end);
		}}
public static void main(String []args) {
	int arr[]= {1,2,3,4,5,6};
	subArray(arr,0,0);
		}
	}
