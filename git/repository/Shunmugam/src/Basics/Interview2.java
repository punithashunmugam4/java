package Basics;


// first positive missing element
public class Interview2 {
 public static void main(String[] args) {
	 int arr[]= {-2,1,2,4,6,-10,-15};
	 for(int j=0;j<arr.length-1;j++) {
		 for(int i=0;i<arr.length-i-1;i++)
		 if(arr[i+1]<arr[i]) {
		 int temp=arr[i];
		 arr[i]=arr[i+1];
		 arr[i+1]=arr[i];
		 }
	 }
	 int arr1[]=new int[arr.length];
	 int j=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>0) {
			  arr1[j]=arr[i];
			  j++;
		 }
	 }
	 int k=0;
		 for(int i=1;i<arr.length;i++) {
			 if(arr1[k]==i) {
				 k++;
				 continue;
			 }
			 else {
				 System.out.print(i);
			 break;
			 
			 }}}}
