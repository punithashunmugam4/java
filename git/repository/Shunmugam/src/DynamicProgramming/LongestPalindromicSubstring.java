package DynamicProgramming;

public class LongestPalindromicSubstring {
	public static int longestPalindromicSubstring(String str,int i,int j, int len) {
		if(i>j) return len;
		if(i==j) return len+1;
		if(str.charAt(i)==str.charAt(j)) {
			 len=longestPalindromicSubstring(str,i+1,j-1,len+2);
			return Math.max(len, Math.max(longestPalindromicSubstring(str, i + 1, j, 0),
			        		longestPalindromicSubstring(str, i, j - 1, 0)));
		}
//		return len;
		return Math.max(longestPalindromicSubstring(str, i + 1, j, 0),
        		longestPalindromicSubstring(str, i, j - 1, 0));
	}
	    public static String longestPalindrome(String s) {
	        if(s==null) return "";
	        if(s.length()==1)
	            return s;
	        int n=s.length();
	        int start=0,end=0;
	        for(int i=0;i<n;i++){
	            for(int j=i;j<n;j++){
	            if(palindrome(s,i,j)){
	                if(j+1-i>end-start){
	                start=i;
	                end=j+1;
	                }
	            }
	        }
	        }
	        return s.substring(start,end);
	    }
	    public static boolean palindrome(String str,int i,int j){
	        if(i==j) return true;
	        while(i<j){
	            if(str.charAt(i)==str.charAt(j)){
	                i++;j--;}
	            else return false;
	        }
	        return true;
	    }   
	    public static String longestPalindrome1(String s) {
	        if(s==null || s.length()<1) return "";
	         int start=0,end=0;
	         for(int i=0;i<s.length();i++){
	             int len1=expandAroundCenter(s,i,i);
	             int len2=expandAroundCenter(s,i,i+1);
	             int len=Math.max(len1,len2);
	             if(len>end-start){
	                 start=i-(len-1)/2;
	                 end=i+len/2;
	             }
	         }
	         return s.substring(start,end+1);
	     }
	     public  static int expandAroundCenter(String s,int l,int r){
	     while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
	         l--;
	         r++;
	     }
	         return r-l-1;
	     }
public static void main(String []args) {
	String str="abibba";
	int len=longestPalindromicSubstring(str,0,str.length()-1,0);
	System.out.println(len);
	System.out.println(longestPalindrome(str));
	System.out.println(longestPalindrome1(str));
}
}
