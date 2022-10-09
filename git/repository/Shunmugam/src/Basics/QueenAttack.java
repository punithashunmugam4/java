package Basics;
import java.util.*;
public class QueenAttack {
	public static int attack(int x,int y,int p,int q) {
		if(x==p)
			return 0;
		else if(y==q)
			return 0;
		
		//to check attack position diagonally
		else if(Math.abs(x-p)==Math.abs(y-q))
			return 0;
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();//x,y position of queen
		int y=sc.nextInt();
		int p=sc.nextInt();//p,q position of King
		int q=sc.nextInt();
		if(attack(x,y,p,q)==0)
		System.out.println("Check");
		else
		System.out.println("King is free");
	}

}
