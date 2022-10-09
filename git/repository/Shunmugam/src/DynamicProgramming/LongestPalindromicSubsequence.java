package DynamicProgramming;

public class LongestPalindromicSubsequence {
	public static int longestPalindromicSubsequence(String str,int i,int j) {
		if(i>j) return 1;
		if(i==j) return 1;
//		if(str.charAt(i)==str.charAt(j) && i+1==j)
//			return 2;
		if(str.charAt(i)==str.charAt(j))
			return longestPalindromicSubsequence(str,i+1,j-1)+2;
		return Math.max(longestPalindromicSubsequence(str,i+1,j),longestPalindromicSubsequence(str,i,j-1));
	}
public static void main(String []args) {
	String str="abiaba";
	System.out.println(longestPalindromicSubsequence(str,0,str.length()-1));
}
}
