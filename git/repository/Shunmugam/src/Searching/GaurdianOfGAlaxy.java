package Searching;
import java.util.*;
public class GaurdianOfGAlaxy {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int building[]=new int[n];
		for(int i=0;i<n;i++){
			building[i]=sc.nextInt();
		}
		int l=0,r=100000,ans=0;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(passed(mid,building)) {
				r=mid-1;
				ans=mid;
			}
			else
				l=mid+1;
		}
		System.out.println(ans);
}
	public static boolean passed(int mid,int building[]){
		int thrust=mid;
		int n=building.length;
		for(int i=0;i<n;i++) {
			thrust+=thrust-building[i];
			if(thrust>=100000)
				return true;
			else if(thrust<0)
				return false;
		}
		return true;
	}
	
}
