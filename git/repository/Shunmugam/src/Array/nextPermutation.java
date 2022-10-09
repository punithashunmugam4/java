package Array;

import java.util.Scanner;

public class nextPermutation {
	    public static void nextPermutationArray(int[] nums) {
	        int i=nums.length-2;
	        while(i>=0 && nums[i+1]<=nums[i])
	            i--;
	        if(i>=0){
	            int j=nums.length-1;
	            while(nums[j]<=nums[i])
	                j--;
	            swap(nums,i,j);
	        }
	        reverse(nums,i+1);
	    }
	public static void swap(int nums[],int i,int j){
	    int temp=nums[i];
	    nums[i]=nums[j];
	    nums[j]=temp;
	}
	public static void reverse(int nums[], int start){
	    int i=start,j=nums.length-1;
	    while(i<j){
	        swap(nums,i,j);
	        i++;
	        j--;
	    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		nextPermutationArray(arr);
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}
	}
