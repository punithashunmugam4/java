package Array;

import java.util.*;
import java.io.*;
public class EVMachine {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	HashMap<Integer,String> evm=new HashMap<>();
	while(n-->0) {
		int id=sc.nextInt();
		String party=sc.next();
		int count=1;
		if(evm.containsValue(party))
			count++;
		if(!evm.containsKey(id)) {
		evm.put(id,party);
		System.out.println(evm.get(id)+" "+count);
	}
	}
	
}
}
