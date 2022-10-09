package Strings;

public class Flames {
	public static void flames(String s1,String s2) {
		int n1=s1.length();
		int n2=s2.length();
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		for(int i=0;i<n1;i++) {
			int c=s1.charAt(i)-'a';
			arr1[c]++;
		}
		for(int i=0;i<n2;i++) {
			int c=s2.charAt(i)-'a';
			arr2[c]++;
		}
		int sum=0;
		for(int i=0;i<26;i++) {
			sum+=Math.abs(arr1[i]-arr2[i]);
		}
		sum=sum%6;
		switch(sum) {
		case 0:
			System.out.println("Friends");
			break;
		case 1:
			System.out.println("Love");
			break;
		case 2:
			System.out.println("Affection");
			break;
		case 3:
			System.out.println("Marriage");
			break;
		case 4:
			System.out.println("Enemy");
			break;
		case 5:
			System.out.println("Sister");
			break;
		}
	}
public static void main(String []args) {
	String s1="anush";
	String s2="anamika";
	flames(s1,s2);
}
}
