package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {
	public static boolean anagram(String str1,String str2) {
		char c[]=str1.toCharArray();
		Arrays.sort(c);
		String result1=String.valueOf(c);
		char d[]=str2.toCharArray();
		Arrays.sort(d);
		String result2=String.valueOf(d);
		if(result1.equals(result2)) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	System.out.println(anagram(str1,str2));
}
}
