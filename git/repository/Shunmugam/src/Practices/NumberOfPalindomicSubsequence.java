package Practices;

public class NumberOfPalindomicSubsequence {
	public static boolean isPalindrome(String str,int i,int j) {
		if(i>j) return true;
		if(str.charAt(i)!=str.charAt(j))
			return false;
	return	isPalindrome(str,i+1,j-1);
	}
	public static int numberOfPSubsequence(String str,int i,int j) {
		if(i>j) return 0;
		if(i==j) return 1;
		if(isPalindrome(str,i,j)) {
			return numberOfPSubsequence(str,i,j-1)+numberOfPSubsequence(str,i+1,j)+1;
		}
		else
			return numberOfPSubsequence(str,i,j-1)+numberOfPSubsequence(str,i+1,j)+1;
	}
public static void main(String []args) {
	String str="aaa";
	int res=numberOfPSubsequence(str,0,str.length()-1);
	System.out.println(res);
}
}
