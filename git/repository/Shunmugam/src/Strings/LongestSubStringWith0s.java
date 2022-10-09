package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*Longest substring with count of 0s more than 1s
Given a binary string find the longest substring which contains 0’s more than 1’s.
Examples: 
 
Input : 1010
Output : 3
Substring 010 has 0 occurring more number of times than 1.

Input : 101100
Output : 5
Substring 01100 has 0 occurring more number of times than 1.*/
public class LongestSubStringWith0s {
	public static int longestSubString(String str) {
		int curlen,max=0,i,count=0;
		int n=str.length();
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(i=0;i<n;i++) {
			if(str.charAt(i)=='0')
				count++;
			else
				count--;
			if(count<0)
				max=i+1;
//			else if(count>=0) {
			else if(hash.containsKey(count-1)) {
					curlen=i-hash.get(count-1);
					max=Math.max(max, curlen);
//				}
			}
			if(!hash.containsKey(count));
			hash.put(count, i);
		}
		return max;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	System.out.println(longestSubString(str));
}
}
