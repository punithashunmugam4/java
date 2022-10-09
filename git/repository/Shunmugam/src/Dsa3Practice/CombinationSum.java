package Dsa3Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
	public static void numberOfSubsequence(int arr[],int k,int i,int n,List<List<Integer>> list,List<Integer> ds) {
		if(i==n) {
			if(k==0) {
				list.add(new ArrayList<>(ds));
			}
			return;
		}
		if(arr[i]<=k) {
		ds.add(arr[i]);
		numberOfSubsequence(arr,k-arr[i],i,n,list,ds);
		ds.remove(ds.size()-1);
		}
		numberOfSubsequence(arr,k,i+1,n,list,ds);
	}
public static void main(String []args) {
	int arr[]= {1,2,3,4,5};
	int k=5;
	List<List<Integer>> list=new ArrayList<>();
	List<Integer> ds=new ArrayList<>();
	numberOfSubsequence(arr,k,0,arr.length,list,ds);
	System.out.println(list);
}
}
