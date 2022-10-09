package Dsa3Practice;

import java.util.ArrayList;
import java.util.List;

public class PrintAllGridPath {
	public static void printAllGridPath(int n,int i,int j,List<List<Integer>> result,List<Integer> ds){
		if(i==n && j==n) {
			ds.add(i);
			ds.add(j);
			result.add(new ArrayList<>(ds));
			ds.remove(ds.size()-1);
			ds.remove(ds.size()-1);
			return;
		}
		if(i>n || j>n) {
			return; 
		}
		ds.add(i);
		ds.add(j);
		printAllGridPath(n,i+1,j,result,ds);
		printAllGridPath(n,i,j+1,result,ds);
		ds.remove(ds.size()-1);
		ds.remove(ds.size()-1);
		return;
	}
public static void main(String []args) {
	int n=4;
	List<List<Integer>> result= new ArrayList<>();
	List<Integer> ds= new ArrayList<>();
	printAllGridPath(n,0,0,result,ds);
	System.out.println(result);
}
}
