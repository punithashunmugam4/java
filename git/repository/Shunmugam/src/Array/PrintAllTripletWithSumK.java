package Array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllTripletWithSumK {
	static void printAllTriplet(int i,int n,int arr[],int sum,int curr,List<Integer> res) {
		if(res.size()==3) { 
			if(curr==sum)
			System.out.println(res);
			return;
		}
		if(i==n)
			return;
		curr+=arr[i];
		res.add(arr[i]);
		printAllTriplet(i+1,n,arr,sum,curr,res);
		curr-=arr[i];
		res.remove(res.size()-1);
		printAllTriplet(i+1,n,arr,sum,curr,res);
			
	}
public static void main(String []args) {
	int sum=7;
	int arr[]= {1,2,3,4,6,3};
	List<Integer> res=new ArrayList<>();
	printAllTriplet(0,arr.length,arr,sum,0,res);
}
}
