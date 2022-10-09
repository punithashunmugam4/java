package Array;

import java.util.HashMap;

public class SubArraywithMore0than1 {
	public static int lengthOfSubArray(int arr[],int n) {
		int sum=0,length=0;
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				arr[i]=-1;
			sum+=arr[i];
			if(sum==1)
				length=i+1;
			else if(hash.containsKey(sum-1)){
				if(length<i-hash.get(sum-1))
					length=i-hash.get(sum-1);
			}
			else if(!hash.containsKey(sum))
				hash.put(sum,i);
		}
		return length;
	}
	public static void main(String []args) {
		int arr[]= {0,1,1,0,0,1};
		int count=lengthOfSubArray(arr,arr.length);
		System.out.println(count);
	}
}
