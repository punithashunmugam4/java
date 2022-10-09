package Strings;

public class BeautifulString {
	static int checkBeautiful(String str) {
		int n=str.length();
		for(int i=0;i<n/2;i++) {
			String s=str.substring(0,i+1);
			int val=Integer.parseInt(s);
			int num=val;
			while(s.length()<n) {
				num++;
				s=s+String.valueOf(num);
			}
			if(str.equals(s)) {
			return val;
		}
	}
		return -1;
	}
public static void main(String[] args) {
	String str="111213";
	checkBeautiful(str);
	int n=checkBeautiful(str);
	if(n!=-1) {
		System.out.println("YES"+" "+n);
	}
	else
		System.out.println("NO");
}
}
