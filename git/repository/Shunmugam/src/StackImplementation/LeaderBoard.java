package StackImplementation;

import java.util.Scanner;
import java.util.Stack;

public class LeaderBoard {
		public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int score[]=new int[n];
		for(int i=0;i<n;i++)
		score[i]=sc.nextInt();
		int m=sc.nextInt();
		int peter[]=new int[m];
		for(int i=0;i<m;i++)
		peter[i]=sc.nextInt();
		int rankcount=1;
		for(int i=0;i<n-1;i++){
			if(score[i]!=score[i+1])
			rankcount++;
		}
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++){
			st.push(score[i]);
		}
		for(int i=0;i<m;i++){
			int popped=st.pop();
			while(!st.empty() && peter[i]>popped){
			popped=st.pop();
			rankcount--;
			}
			if(peter[i]<popped){
				System.out.println(rankcount+1);
			}
			else if(peter[i]==popped)
			System.out.println(rankcount+1);
			rankcount--;
			if(st.empty())
			System.out.println(1);
		}
		}
	}
