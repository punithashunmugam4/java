package Searching;
import java.util.*;
public class MedianTwoArray {
	public static double median(int A[],int B[],int n,int m) {
		int i=0,j=0;
	 double m1=-1,m2=-1;
		int centre=(n+m)/2;
	if(centre%2==1) {
		for(int k=0;k<=centre;k++) {
			if(i!=n && j!=m) {
				m1=(A[i]>B[j]) ? B[j++]:A[i++];
			}
			else if(i<n)
				m1=A[i++];
			else
				m1=B[j++];
		}
		return m1;
	}
	else {
		for(int k=0;k<=centre;k++) {
			m2=m1;
			if(i!=n && j!=m) {
				m1=(A[i]>B[j]) ? B[j++]:A[i++];
			}
			else if(i<n)
				m1=A[i++];
			else 
				m1=B[j++];
		}
		return (m1+m2)/2;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int A[]=new int[n];
	int B[]=new int[m];
	for(int i=0;i<n;i++)
		A[i]=sc.nextInt();
	for(int i=0;i<m;i++)
		B[i]=sc.nextInt();
	double ans=median(A,B,n,m);
	System.out.printf("%.2f", ans);
}
}
