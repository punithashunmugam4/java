package Basics;
import java.util.*;
import java.io.*;
//find point which does not form rectangle

public class TooManyRectangles  {
public static void main(String []args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int X[]=new int[1000001];
	int Y[]=new int[1000001];
	for(int i=0;i<(4*n+1);i++) {
		String S[]=br.readLine().split(" ");
		int x=Integer.parseInt(S[0]);
		int y=Integer.parseInt(S[1]);
		X[x]++;
		Y[y]++;
	}
	notRect(X,Y,n);
	}
public static void notRect(int X[],int Y[],int n) {
	for(int i=0;i<1000001;i++) {
		if(X[i]%2==1) {
			System.out.print(i+" ");
			break;
		}
	}
	for(int i=0;i<1000001;i++) {
		if(Y[i]%2==1) {
			System.out.print(i+" ");
			break;
		}
	}
}
}
