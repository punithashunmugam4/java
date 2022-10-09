package Array;

import java.util.Scanner;

public class LongestDistinctString {
	public static int LengthOfDistString(String str) {
		String temp="";
		int maxLength=-1;
		if(str.isEmpty()) {
			return 0;
		}
		else if(str.length()==1)
			return 1;
		for(char c:str.toCharArray()) {
			String current=String.valueOf(c);
		if(temp.contains(current)) {
			temp=temp.substring(temp.indexOf(current)+1);
		}
		 temp = temp + String.valueOf(c);
         maxLength = Math.max(temp.length(), maxLength);
     }
     return maxLength;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0) {
		String str=sc.next();
		int len = LengthOfDistString(str);
        System.out.println(len);
		t--;
	}
}
}
