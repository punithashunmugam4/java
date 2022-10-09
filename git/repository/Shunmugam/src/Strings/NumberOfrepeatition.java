package Strings;

public class NumberOfrepeatition {
	static void repetition(String str) {
		int freq[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			freq[c-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(freq[i]!=0) {
				char a=(char)(i+(int)'a');
				System.out.println(a+" -> "+freq[i]);
			}
		}
	}
public static void main(String[] args) {
	String str="jknedfkjnijfn";
	repetition(str);
}
}
