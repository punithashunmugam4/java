package Practices;

public class PalindromePartitioning {
	private static boolean isPalindrome(String str,int i,int j) {
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) 
				return false;
				i++;
				j--;
		}
		return true;
	}
	public static int palindromePartition(String str,int i,int n) {
		if(i==n) return 0;
		int minPart=Integer.MAX_VALUE;
		for(int j=i;j<n;j++) {
			if(isPalindrome(str,i,j)) {
				int part=1+palindromePartition(str,j+1,n);
				minPart=Math.min(minPart, part);
			}
		}
		return minPart;
	}
public static void main(String []args) {
	String str="aaba";
	System.out.println(palindromePartition(str,0,str.length()));
}
}
