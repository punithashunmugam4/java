package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPermutation {
	public static void findPermutation(int arr[],int n,List<Integer> ds,boolean freq[],List<List<Integer>> res) {
		if(ds.size()==n) {
			res.add(new ArrayList<>(ds));
			return;
		}
		for(int i=0;i<n;i++) {
		if(!freq[i]) {
			ds.add(arr[i]);
			freq[i]=true;
			findPermutation(arr,n,ds,freq,res);
			ds.remove(ds.size()-1);
			freq[i]=false;
		}
		}
	}
	public static List<List<Integer>> printPermutation(int arr[],int n){
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		boolean freq[]=new boolean[n];
		findPermutation(arr,n,ds,freq,result);
		return result;
	}
	//optized approach
	public static void findPermutation1(int arr[],int index,int n,List<Integer> ds,List<List<Integer>> res) {
		if(index==n) {
			ds=new ArrayList<>();
			for(int i=0;i<n;i++)
				ds.add(arr[i]);
			res.add(new ArrayList<>(ds));
			return;
		}
		for(int i=index;i<n;i++) {
			swap(arr,i,index);
			findPermutation1(arr,index+1,n,ds,res);
			swap(arr,i,index);
		}
	}
	private static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static List<List<Integer>> printPermutation1(int arr[],int n) {
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		findPermutation1(arr,0,n,ds,res);
		return res;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	List<List<Integer>> res=printPermutation(arr,n);
//	for(int i=0;i<res.size();i++) {
//		for(int j=0;j<res.get(i).size();j++) {
//			System.out.print(res.get(i).get(j)+" ");
//		}
//		System.out.println();
//	}
	System.out.println(res);
	List<List<Integer>> res1=printPermutation1(arr,n);
	for(int i=0;i<res1.size();i++) {
		for(int j=0;j<res1.get(i).size();j++) {
			System.out.print(res1.get(i).get(j)+" ");
		}
		System.out.println();
	}
}
}
