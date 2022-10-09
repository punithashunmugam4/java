package Strings;

public class ReverseString {
public static void main(String []args) {
	String str="abcdef";
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
	}
	System.out.println(rev);
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	System.out.println(sb.toString());
}
}
