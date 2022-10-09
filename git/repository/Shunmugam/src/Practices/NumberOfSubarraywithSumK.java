package Practices;

import java.util.HashMap;

public class NumberOfSubarraywithSumK {
	static int NoSsubarray(int arr[],int k){
		int n=arr.length;
		int sum=0,count=0;
	HashMap<Integer,Integer> hash=new HashMap<>();
	for(int i=0;i<n;i++) {
		sum+=arr[i];
		if(sum==k)
			count++;
		if(hash.containsKey(sum-k)) {
			count+=hash.get(sum-k);
		}
		if(!hash.containsKey(sum)) {
			hash.put(sum, 1);
		}
		else
			hash.put(sum,hash.get(sum)+1);
	}
	return count;
	}
public static void main(String []args) {
	int arr[]= {1,2,3,5,2,3};
	int k=10;
	int res=NoSsubarray(arr,k);
	System.out.println(res);
}
}
