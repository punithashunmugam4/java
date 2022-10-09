package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequenceWithSumk {
	public static void printAllsubsequenceWithSum(int index,int []arr,int n,int curr_sum,int k,List<Integer> list){
		if(index==n) {
			if(curr_sum==k) {
				System.out.println("");
                for(int i = 0; i < list.size(); i++)
                    System.out.print(list.get(i)+" ");
			}
			return;
		}
		curr_sum+=arr[index];
		list.add(arr[index]);
		printAllsubsequenceWithSum(index+1,arr,n,curr_sum,k,list);
		curr_sum-=arr[index];
		list.remove(list.size()-1);
		printAllsubsequenceWithSum(index+1,arr,n,curr_sum,k,list);
	}
	public static boolean printonesubsequenceWithSum(int index,int arr[],int n,int curr_sum,int sum,List<Integer> list) {
		if(index==n) {
			if(curr_sum==sum) {
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i)+" ");
				}
				return true;
			}
			return false; 
		}
		curr_sum+=arr[index];
		list.add(arr[index]);
		if(printonesubsequenceWithSum(index+1,arr,n,curr_sum,sum,list))
			return true;
		curr_sum-=arr[index];
		list.remove(list.size()-1);
		if(printonesubsequenceWithSum(index+1,arr,n,curr_sum,sum,list))
			return true;
		return false;
	}
	public static int countAllSubsequenceWithSum(int index,int arr[],int n,int curr_sum,int sum) {
		if(index==n) {
			if(curr_sum==sum)
				return 1;
			else
				return 0;
		}
		curr_sum+=arr[index];
		int pick=countAllSubsequenceWithSum(index+1,arr,n,curr_sum,sum);
		curr_sum-=arr[index];
		int unpick=countAllSubsequenceWithSum(index+1,arr,n,curr_sum,sum);
		return pick+unpick;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	List<Integer> list=new ArrayList<>();
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int curr_sum=0;
	printAllsubsequenceWithSum(0,arr,n,curr_sum,k,list);
	System.out.println();
	printonesubsequenceWithSum(0,arr,n,curr_sum,k,list);
	System.out.println();
	int count=countAllSubsequenceWithSum(0,arr,n,curr_sum,k);
	System.out.println(count);
}
}
