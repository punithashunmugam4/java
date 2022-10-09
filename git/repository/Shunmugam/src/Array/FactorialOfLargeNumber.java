package Array;

import java.util.ArrayList;
import java.util.List;

public class FactorialOfLargeNumber {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list=factorial(1000);
	System.out.println(list);
	System.out.println(list.size());
	String str=String.valueOf(list);
	for(Integer x:list)
	System.out.print(x);
}
static ArrayList<Integer> factorial(int n){
	ArrayList<Integer> list=new ArrayList<>();
	int res_size=1;
	int res[]=new int[10000];
	res[0]=1;
	for(int x=2;x<=n ;x++) {
		res_size=multiply(x,res,res_size);
	}
	for(int i=res_size-1;i>=0;i--) {
		list.add(res[i]);
	}
	return list;
}
static int multiply(int x,int res[],int res_size) {
	int carry=0;
	for(int i=0;i<res_size;i++) {
		int pro=x*res[i]+carry;
		res[i]=pro%10;
		carry=pro/10;
	}
	while(carry!=0) {
		res[res_size]=carry%10;
		carry=carry/10;
		res_size++;
	}
	return res_size;
}
}
