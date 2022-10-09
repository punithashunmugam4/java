package Array;

import java.util.HashMap;

public class SubArraywithEqual1sAnd0s {
	public static int numberOfSubArray(int arr[],int n) {
		HashMap<Integer,Integer> hash=new HashMap<>();
		int sum=0,count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				arr[i]=-1;
			sum+=arr[i];
			if(sum==0) {
				count++;
			if(hash.containsKey(sum))
				count+=hash.get(sum);
			if(hash.containsKey(sum))
				hash.put(sum,hash.get(sum)+1);
			else
				hash.put(sum, 1);
		}
		}
		return count;
	}
public static void main(String []args) {
	int arr[]= {1,0,0,1,0,1};
	int count=numberOfSubArray(arr,arr.length);
	System.out.println(count);
}
}
