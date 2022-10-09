package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateInString {
	public static void findDuplicate(char []arr,int n) {
		HashMap<Character,Integer> hash=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hash.containsKey(arr[i]))
				hash.put(arr[i], hash.get(arr[i])+1);
			else
				hash.put(arr[i], 1);
		}
		for(Map.Entry<Character, Integer> e:hash.entrySet()) {
			if(e.getValue()>1) {
				System.out.println("character:"+e.getKey()+" occurs "+e.getValue()+" times");
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	char arr[]=str.toCharArray();
	int n=arr.length;
	findDuplicate(arr,n);
}
}
