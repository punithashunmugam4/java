package Dsa3Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllPermutation {
	public static List<List<Integer>> AllPermutationswapping(int arr[]){
		int n=arr.length;
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		return printAllPermutationSwapping(arr,0,n,res,ds);
	}
	public static List<List<Integer>> printAllPermutationSwapping(int arr[],int index,int n,List<List<Integer>> res,List<Integer> ds){
		if(index==n) {
			ds=new ArrayList<>();
			for(int i=0;i<n;i++) {
				ds.add(arr[i]);
			}
			res.add(new ArrayList<>(ds));
			return res;
		}
		for(int i=index;i<n;i++) {
			swap(arr,i,index);
			printAllPermutationSwapping(arr,index+1,n,res,ds);
			swap(arr,i,index);
		}
		return res;
	}
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static List<List<Integer>> printAllPermutation(int arr[],int index,int n,boolean []state,List<List<Integer>> res,List<Integer> ds){
		if(index==n) {
			res.add(new ArrayList<>(ds));
			return res;
		}
		for(int i=0;i<n;i++) {
			if(!state[i]) {
			ds.add(arr[i]);
			state[i]=true;
			printAllPermutation(arr,index+1,n,state,res,ds);
			ds.remove(ds.size()-1);
			state[i]=false;
			}
		}
		return res;
	}
	public static List<List<Integer>> printPermutation(int arr[]) {
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		int n=arr.length;
		boolean state[]=new boolean[n];
		Arrays.fill(state, false);
		return printAllPermutation(arr,0,n,state,res,ds);
	}
public static void main(String []args) {
	int arr[]= {1,2,3};
	List<List<Integer>> res=printPermutation(arr);
	System.out.println(res);
	List<List<Integer>> res1=printPermutation(arr);
	System.out.println(res1);
}
}
