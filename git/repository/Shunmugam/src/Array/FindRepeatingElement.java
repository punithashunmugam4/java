package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatingElement {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	minimumRepeating(arr,n);
	System.out.println();
	mostRepeatingElement(arr,n);
	withoutRepeatition(arr,n);
}
public static void minimumRepeating(int arr[],int n) {
	HashMap<Integer,Integer> hash=new HashMap<>();
	for(int i=0;i<n;i++) {
		if(hash.containsKey(arr[i]))
			hash.put(arr[i],hash.get(arr[i])+1);
		else
			hash.put(arr[i], 1);
	}
		for(Map.Entry<Integer,Integer> x:hash.entrySet())
			if(x.getValue()==1)
			System.out.print(x.getKey()+" ");
}
public static void mostRepeatingElement(int arr[],int n) {
	HashMap<Integer,Integer> hash=new HashMap<>();
	int count=0,max=0,value=0;
	for(int i=0;i<n;i++) {
		if(hash.containsKey(arr[i])) {
			hash.put(arr[i],hash.get(arr[i])+1);
			count=hash.get(arr[i]);
			if(count>max) {
			max=Math.max(count,max);
			value=arr[i];
			}
		}
		else
			hash.put(arr[i], 1);
}
	System.out.println(value);
}
public static void withoutRepeatition(int arr[],int n) {
	HashMap<Integer,Integer> hash=new HashMap<>();
	for(int i=0;i<n;i++) {
		if(hash.containsKey(arr[i]))
			hash.put(arr[i],hash.get(arr[i])+1);
		else
			hash.put(arr[i], 1);
	}
		for(Map.Entry<Integer,Integer> x:hash.entrySet())
			System.out.print(x.getKey()+" ");
}
}
