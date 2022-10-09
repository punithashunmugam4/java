package Array;

import java.util.HashMap;
import java.util.Scanner;

public class MissingElementClosestToK {
	public static void missingElementCloseToK(int arr[],int n,int k) {
		HashMap<Integer,Boolean> hash=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!hash.containsKey(arr[i]))
				hash.put(arr[i],true);
		}
		int l=k,r=k;
		while(true) {
			if(!hash.containsKey(l)) {
				System.out.println(l);
				return;
			}
			else
				l--;
			if(!hash.containsKey(r)) {
				System.out.println(r);
				return;
			}
			else
				r++;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
			
	missingElementCloseToK(arr,n,k);
}
}
