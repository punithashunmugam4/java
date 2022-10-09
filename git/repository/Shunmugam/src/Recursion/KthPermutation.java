package Recursion;
import java.util.*;
import java.io.*;
public class KthPermutation {
	     public static String solve(ArrayList<Integer> list,int n,int k){
	         if(n == 0 || list.size() == 0) return ""; 
	          int fact=1;
	        for(int i=1;i<n;i++){
	         fact=fact*i;
	        }
	          int index=k/fact;
	    String num=Integer.toString(list.get(index));
	    System.out.println(list);
	    list.remove(index);
	    return num + solve(list,n-1,k%fact);
	     }
	      public static void main(String []args){
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int k=sc.nextInt();
	     ArrayList<Integer> list = new ArrayList<>();
			for(int i = 1; i <= n; i++) {
				list.add(i);
	        }
	            if(n > 12) {
				for(int i = 0; i < n - 12; i++) {
					System.out.print(list.get(0));
					list.remove(0);
	            }
	            }
	              System.out.print(solve(list,list.size(),k-1));
	            }
	}
