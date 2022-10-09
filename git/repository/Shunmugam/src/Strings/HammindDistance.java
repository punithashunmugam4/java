package Strings;

import java.util.Scanner;

public class HammindDistance {
	public static int hammingDistance(String str) {
		int arr[]=new int[26];
		int n=str.length();
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			arr[c-'a']++;
		}
		int max=0;
		for(int i=0;i<26;i++) {
			if(max<arr[i]) 
				max=arr[i];
			}
				if(max<n/2)
					return n;
				else
					return 2*(n-max);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	System.out.println(hammingDistance(str));
	
}
}
