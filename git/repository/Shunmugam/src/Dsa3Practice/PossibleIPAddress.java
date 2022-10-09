 package Dsa3Practice;

import java.util.Arrays;

public class PossibleIPAddress {
	public static void possibleIpAddress(char[] arr,int i,int idx,String []res) {
		if(i==4) {
			if(idx<arr.length) {
				return;
			}
			for( int p=0; p<3; p++ ) {

				System.out.print( res[p] + "." );
			}
			System.out.println(res[3]);
			return;
		}
		for(int j=idx;j<arr.length;j++) {
			res[i]=res[i]+arr[j];
			possibleIpAddress(arr,i+1,j+1,res);
		}
		res[i]="";
		return;
	}
public static void main(String []args) {
	char arr[]= {'1','2','3','4','5'};
	String res[]=new String[4];
	Arrays.fill(res,"");
	possibleIpAddress(arr,0,0,res);
}
}
