package Dsa3Practice;

import java.util.Arrays;

public class WordBoggle {
public static void main(String []args) {
	String[] str= {"geeks","of","quiz","go"};
	int n=3;
	int m=3;
	char[][] words= {{'g','i','z'},
					 {'u','e','k'},
					 {'q','s','e'}};
	Arrays.sort(str);
	boolean flag=false;
		for(int i=0;i<str.length;i++) {
			if(wordboggle(words,str[i],n,m)) {
				System.out.print(str[i]+" ");
				flag=true;
			}
		}
		if(flag==false) System.out.print(-1);

}
public static boolean wordboggle(char[][] words,String str,int n,int m) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(words[i][j]==str.charAt(0)) {
				if(search(words,str,i,j,0))
				return true;
			}
		}
	}
	return false;
}
public static boolean search(char[][]words,String str,int i,int j,int index) {
	if(index==str.length()) return true;
	if( i<0 || j<0 || i == words.length || j == words[0].length ) {
		return false;
	}
	if(str.charAt(index)==words[i][j]) {
		words[i][j]='.';
		boolean res=search(words,str,i,j-1,index+1) ||
				search(words,str,i,j+1,index+1) ||
				search(words,str,i-1,j,index+1) ||
				search(words,str,i+1,j,index+1) ||
				search(words,str,i-1,j-1,index+1) ||
				search(words,str,i+1,j-1,index+1) ||
				search(words,str,i-1,j+1,index+1) ||
				search(words,str,i+1,j+1,index+1);
		words[i][j]=str.charAt(index);
		return res;
	}
	return false;
}
}
