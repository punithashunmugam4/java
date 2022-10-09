package Dsa3Practice;
import java.util.*;

public class AllCombinationWithsizeK {
	public static void findAllCombination(int arr[],int index,int n,int k,List<Integer> list) {
		if(list.size()==k) {
			System.out.print(list+" , ");
			return;
		}
		for(int j=index;j<n;j++) {
			list.add(arr[j]);
			findAllCombination(arr,j,n,k,list);
			list.remove(list.size()-1);
		}
	}
	public static void findAllCombinationNonRepeated(int arr[],int index,int n,int k,List<Integer> list) {
		if(list.size()==k) {
			System.out.print(list+" , ");
			return;
		}
		if(index==n) return;
		for(int j=index;j<n;j++) {
			list.add(arr[j]);
			findAllCombinationNonRepeated(arr,j+1,n,k,list);
			list.remove(list.size()-1);
		}
	}
public static void main(String []args) {
	int arr[]= {1,2,3,4,5,6,7};
	int k=3;
	List<Integer> list=new ArrayList<>();
	findAllCombination(arr,0,arr.length,k,list);
	System.out.println();
	findAllCombinationNonRepeated(arr,0,arr.length,k,list);
}
}
