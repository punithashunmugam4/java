package Array;

public class WalterWhiteEasy {
	public static void subarray(int arr[]) {
		int subarray[]=new int[3];
		for(int i=0;i<arr.length-2;i++) {
			int k=0;
			for(int j=i;j<i+3;j++) {
				subarray[k]=arr[j];
				k++;
			}
		}
	}
	public static void main(String []args) {
		
	}

}
