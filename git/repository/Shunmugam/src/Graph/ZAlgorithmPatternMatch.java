package Graph; 

public class ZAlgorithmPatternMatch {
	public static void zAlgorithm(String str,String pattern) {
		String s=pattern+"$"+str;
		int n=s.length();
		int z[]=new int[n];
		findZvalues(s,n,z);
		for(int i=0;i<n;i++) {
			System.out.print(z[i]+" ");
		}
		for(int i=0;i<n;i++)
			if(z[i]==pattern.length()) {
				System.out.println("Match found");
				return;
			}
	}
	public static void findZvalues(String s,int n,int z[]) {
		int l=0,r=0;
		for(int i=1;i<n;i++) {
			if(i>r) {
				l=r=i;
		while(r<n && s.charAt(r-l)==s.charAt(r))
			r++;
			z[i]=r-l;
			r--;
			}
			else {
				// k=index of previous pattern match
				int k=i-l;
				// check whether length of pattern repitions are same 
				// we can use z[k]==r-i
				if(z[k]<r-i+1) {
					z[i]=z[k];
				}
				else {
					l=i;
					while(r<n && s.charAt(r-l)==s.charAt(r))
						r++;
						z[i]=r-l;
						r--;
				}
			}
		}
	}
public static void main(String []args) {
	String str="jkabciokkhabckhlliabcik";
	String pattern="abc";
	zAlgorithm(str,pattern);
}
}
