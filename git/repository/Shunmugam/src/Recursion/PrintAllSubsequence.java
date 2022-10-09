package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllSubsequence {
	static void findsubsequence1(int index,int arr[],List<Integer> ds,List<List<Integer>> res) {
			if(ds.size()==3 && !res.contains(ds)) {
			res.add(new ArrayList<>(ds));
			return;
		}
			if(index==arr.length) {
				return;
			}
		ds.add(arr[index]);
		findsubsequence1(index+1,arr,ds,res);
		ds.remove(ds.size()-1);
		findsubsequence1(index+1,arr,ds,res);
	}
	static List<List<Integer>> printsubsequence1(int arr[],int n){
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		findsubsequence1(0,arr,ds,res);
		return res;
	}
	static void findsubsequence(int index,int arr[],List<Integer> ds,List<List<Integer>> res) {
		if(index==arr.length) {
			if(!res.contains(ds))
			res.add(new ArrayList<>(ds));
			return;
		}
		ds.add(arr[index]);
		findsubsequence(index+1,arr,ds,res);
		ds.remove(ds.size()-1);
		findsubsequence(index+1,arr,ds,res);
	}

	static List<List<Integer>> printsubsequence(int arr[],int n){
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		findsubsequence(0,arr,ds,res);
		return res;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	List<List<Integer>> res=printsubsequence(arr,n);
	System.out.println(res);
	List<List<Integer>> res1=printsubsequence1(arr,n);
	System.out.println(res1);
}
}
