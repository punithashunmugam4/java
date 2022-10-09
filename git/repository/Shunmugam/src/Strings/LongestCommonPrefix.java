package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String str[]) {
		int n=str.length;
		Arrays.sort(str);
		int i=0;
		 int end = Math.min(str[0].length(), str[n-1].length());
		while(i<end && str[0].charAt(i)==str[n-1].charAt(i)) {
				i++;
			}
		return str[0].substring(0,i);
	}
public static void main(String[] args) {
     String[] input = {"geeksforgeeks", "geeks", "geek", "geeker"};
     System.out.println( "The longest Common Prefix is : "+longestCommonPrefix(input));
}
}
