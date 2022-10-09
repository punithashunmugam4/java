package Array;
import java.util.Scanner;

public class FindElementNotPresentInArray {
	public static void findElementNotPresent(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			if(arr[i+1]==arr[i]+1) {
				continue;
			}
			else 
				while(arr[i+1]!=arr[i]+1) {
				arr[i]=arr[i]+1;
				System.out.println(arr[i]);
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	findElementNotPresent(arr,n);
}
}
