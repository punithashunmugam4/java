package Array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubArrayWithSumK {
	public static void findAllSubArrayWithSumK(int arr[],int n,int k,List<List<Integer>> res,List<Integer> ds) {
		int l=0,sum=0;
		for(int i=0;i<n;i++) {
				sum+=arr[i];
				ds.add(arr[i]);
			while(sum>k) {
				sum-=arr[l];
				l++;
				ds.remove(0);
			}
			if(sum==k)
				res.add(new ArrayList<>(ds));
		}
	}
	public static List<List<Integer>> printAllSubarray(int arr[],int n,int k){
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		findAllSubArrayWithSumK(arr,n,k,res,ds);
		return res;
	}
public static void  main(String []args) {
	int arr[]= {2,3,2,4,5,1};
	int n=arr.length;
	int k=6;
	System.out.println(printAllSubarray(arr,n,k));
}
}
