package Strings;

public class OnlyNonRepeatingCharacter {
	public static int onlyNonrepeatingCharacter(String str) {
		int freq[]=new int[26];
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			freq[c-'a']++;
		}
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			if(freq[c-'a']==1) {
				System.out.print(c);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str="geeksforgeeks";
		int count=onlyNonrepeatingCharacter(str);
		System.out.println(count);
	}
}
