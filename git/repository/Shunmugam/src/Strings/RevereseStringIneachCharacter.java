package Strings;

public class RevereseStringIneachCharacter {
public static void main(String []args) {
	String str="I am java developer";
	String arr[]=str.split(" ");
//	String res="";
	for(int i=0;i<arr.length;i++) {
		arr[i]=reverse(arr[i]);
//		res+=String.valueOf(arr[i]+" ");
	}
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");
//	System.out.print(res);
}
public static String reverse(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	return rev;
}
}
