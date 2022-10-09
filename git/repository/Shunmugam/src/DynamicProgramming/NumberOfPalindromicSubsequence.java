package DynamicProgramming;
import java.util.Arrays;
public class NumberOfPalindromicSubsequence {
		private static boolean isPalindrome(String str,int i,int j) {
			if(i>j) return true;
			if(str.charAt(i)!=str.charAt(j))
				return false;
			return isPalindrome(str,i+1,j-1);
		}
		public static int numberOfPSubstringRrecursive(String str,int i,int j) {
			if(i>j) return 0;
			if(i==j) return 1;
			if(isPalindrome(str,i,j)) {
				return numberOfPSubstringRrecursive(str,i+1,j)+numberOfPSubstringRrecursive(str,i,j-1)+1;
			}
			return numberOfPSubstringRrecursive(str,i+1,j)+numberOfPSubstringRrecursive(str,i,j-1);
		}
		static int dp[][];
		static boolean flag[][];
		public static boolean isPalindromedp(String str,int i,int j) {
			if(i>j) return true;
			if(flag[i][j]) {
				return flag[i][j];
			}
			if(str.charAt(i)!=str.charAt(j)) {
				return flag[i][j]=false;
			}
			
			return flag[i][j]=isPalindromedp(str,i+1,j-1);
		}
		public static int dpNoOfPalindromicSubstring(String str,int i,int j) {
			if(i>j) return 0;
			if(i==j) {
				System.out.println(str.substring(i, j+1));
				return 1;
			}
			if(dp[i][j]!=-1) {
				System.out.println(str.substring(i, j+1));
				return dp[i][j];
			}
			else if(isPalindromedp(str,i,j)) {
				dp[i][j]=dpNoOfPalindromicSubstring(str,i+1,j)+dpNoOfPalindromicSubstring(str,i,j-1)+1;
			}
			else {
				dp[i][j]=dpNoOfPalindromicSubstring(str,i+1,j)+dpNoOfPalindromicSubstring(str,i,j-1);
			}
			System.out.println(str.substring(i, j+1));
			return dp[i][j];
		}
		public static int numberOfPSubstringdp(String str) {
			int n=str.length();
		dp=new int[n][n];
		flag=new boolean[n][n];
		for(int row[]:dp)
			Arrays.fill(row, -1);
		for(boolean row[]:flag)
			Arrays.fill(row, false);
		return dpNoOfPalindromicSubstring(str,0,n-1);
		}
	public static void main(String []args) {
		String str="aabaa";
		System.out.println(numberOfPSubstringRrecursive(str,0,str.length()-1));
		System.out.println(numberOfPSubstringdp(str));
	}
	}

