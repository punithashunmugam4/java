package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintAllSubsequenceInSortedOrder {
	public static void printAllSubsequence(String str,int n,int i,List<List<Character>> list,List<Character> ds) {
		if(i==n) {
			Collections.sort(ds);
			int j=0;
			while(j<list.size()) {
				if(list.get(j).size()<ds.size()) {
					j++;
				}
				else break;
			}
			list.add(j,new ArrayList(ds));
			return;
		}
		ds.add(str.charAt(i));
		printAllSubsequence(str,n,i+1,list,ds);
		ds.remove(ds.size()-1);
		printAllSubsequence(str,n,i+1,list,ds);
		return;
	}
public static void main(String []args) {
	String str="abcd";
	List<List<Character>> list=new ArrayList<>();
	List<Character> ds=new ArrayList<>();
	printAllSubsequence(str,str.length(),0,list,ds);
	System.out.println(list);
}
}
