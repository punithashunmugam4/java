package Strings;

import java.util.*;

public class kthNonRepeatingChar {
	public static int kthNonrepeatCharacter(String str,int k) {
		int n=str.length();
		int index[]=new int[26];
		int count[]=new int[26];
		for(int i=0;i<26;i++) {
			count[i]=0;
			index[i]=n;
		}
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			int d=c-'a';
			count[d]++;
		if(count[d]==1)
			index[d]=i;
		if(count[d]>=2)
			index[d]=n;	
		}
		Arrays.sort(index);
		return (index[k-1]!=n)? index[k-1]:-1;
	}
public static void main(String[] args) {
	int k=3;
	String str="geeksforgeeks";
	int result=kthNonrepeatCharacter(str,k);
	System.out.println(result==-1? "There are less than k non-repesting character":"kth non-repeating character is " + str.charAt(result));
}
}
