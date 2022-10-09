package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
	public static void findcombination(int index,int arr[],int n,int k,List<Integer> ds,List<List<Integer>> result){
		if(index==n) {
			if(k==0) {
				result.add(new ArrayList<>(ds));
			}
			return;
		}
		if(arr[index]<=k) {
			ds.add(arr[index]);
			findcombination(index,arr,n,k-arr[index],ds,result);
			ds.remove(ds.size()-1);
		}
			findcombination(index+1,arr,n,k,ds,result);
	}
	public static List<List<Integer>> combinationSum(int arr[],int n,int k){
		List<List<Integer>> result =new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		findcombination(0,arr,n,k,ds,result);
		return result;
	}
public static void main(String []args) {
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
//	int k=sc.nextInt();
//	int arr[]=new int[n];
//	for(int i=0;i<n;i++)
//		arr[i]=sc.nextInt();
	int arr[]= {1,2,3,4,2,1};
	int k=5;
	int n=arr.length;
	List<List<Integer>> result=combinationSum(arr,n,k);
	System.out.println(result);
}
}
