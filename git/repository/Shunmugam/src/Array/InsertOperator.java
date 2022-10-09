package Array;
import java.util.*;
public class InsertOperator {
	 static boolean insert(int A[], int size, int x) {
	      for (int i = 0; i < (size - 1); i++) {
	          for (int j = (i + 1); j < size; j++) {
	              if (A[i] + A[j] == x) {
	                  System.out.println("Pair with a given sum " + x +
	                                     " is (" + A[i] + ", " + A[j] + ")");
	   
	                  return true;
	              }
	          }
	      }
	 
	      return false;
	  }
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=i+1;
		}
	if(insert(arr,n,k))
	System.out.println("YES");
	else
	System.out.println("NO");
	}
}
