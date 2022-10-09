package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDulplicateCharFromArrayOfString {
	public static void removeDuplicate(String s) {
		char arr[]=s.toCharArray();
		HashMap<Character,Integer> hash=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hash.containsKey(arr[i]))
				hash.put(arr[i],hash.get(arr[i])+1);
			else
				hash.put(arr[i],1);
		}
		for(Map.Entry<Character, Integer> e:hash.entrySet()) {
				System.out.print(e.getKey());
		}
	}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String str[]=new String[n];
	for(int i=0;i<n;i++) {
		str[i]=sc.next();
	}
	for(int i=0;i<n;i++) {
		if(str[i].equals("null")) {
			System.out.print("null, ");
			continue;
		}
	removeDuplicate(str[i]);
	System.out.print(", ");
	}
}
}
