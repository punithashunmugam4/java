package Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadrupleWithSumK {
	public static void findquadrupleOfSum(int arr[],int n,int val,List<Integer> ds,List<List<Integer>> list) {	
		int sum=0;
		for(int i=0;i<n-3;i++) {
			for(int j=i+1;j<n-2;j++) {
				for(int k=j+1;k<n-1;k++) {
					for(int l=k+1;l<n;l++) {
					sum=arr[i]+arr[j]+arr[k]+arr[l];
					if(sum==val) {
					ds.add(arr[i]);
					ds.add(arr[j]);
					ds.add(arr[k]);
					ds.add(arr[l]);
					}
					}
				if(!ds.isEmpty() && !list.contains(ds)) {
					list.add(new ArrayList<>(ds));
				}
				ds.removeAll(ds);
				}
			}
		}
		if(list.isEmpty())
			System.out.println(-1);
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	List<List<Integer>> list=new ArrayList<>();
	List<Integer> ds=new ArrayList<>();
	findquadrupleOfSum(arr,n,k,ds,list);
	if(!list.isEmpty())
	System.out.println(list);
}
}
