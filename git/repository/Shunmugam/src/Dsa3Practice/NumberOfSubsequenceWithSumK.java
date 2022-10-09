package Dsa3Practice;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSubsequenceWithSumK {
	public static int numberOfSubsequence(int arr[],int k,int sum,int i,int n,List<List<Integer>> list,List<Integer> ds) {
		if(i==n) {
			if(sum==k) {
				list.add(new ArrayList<>(ds));
				return 1;
			}
			else return 0;
		}
		sum+=arr[i];
		ds.add(arr[i]);
		int pick=numberOfSubsequence(arr,k,sum,i+1,n,list,ds);
		sum-=arr[i];
		ds.remove(ds.size()-1);
		int unpick=numberOfSubsequence(arr,k,sum,i+1,n,list,ds);
		return pick+unpick; 
	}
public static void main(String []args) {
	int arr[]= {1,2,3,4,2,1};
	int k=5;
	List<List<Integer>> list=new ArrayList<>();
	List<Integer> ds=new ArrayList<>();
	int res=numberOfSubsequence(arr,k,0,0,arr.length,list,ds);
	System.out.println(res);
	System.out.println(list);
}
}
