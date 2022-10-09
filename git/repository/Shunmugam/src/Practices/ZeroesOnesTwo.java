package Practices;

public class ZeroesOnesTwo {
	public static void arrange(int arr[]) {
		int l=0,m=0,n=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				l++;
			else if(arr[i]==1)
			m++;
			else
				n++;
		}
		int i=0;
		while(i<l)
			arr[i++]=0;
		while(i<l+m)
			arr[i++]=1;
		while(i<l+m+n)
			arr[i++]=2;
	}
	public static void arrange1(int arr[]) {
		int l=0,r=arr.length-1;
		int mid=0,temp=0;
		while(mid<=r) {
			switch(arr[mid]) {
			case 0:{
				temp=arr[l];
				arr[l]=arr[mid];
				arr[mid]=temp;
				mid++;
				l++;
				break;
			}
			case 1:{
				mid++;
				break;
			}
			case 2:{
				temp=arr[r];
				arr[r]=arr[mid];
				arr[mid]=temp;
				r--;
				break;
			}
			
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {0,1,2,1,2,0,1,2,0,1,1};
	arrange1(arr);
	for(int j=0;j<arr.length;j++)
	System.out.print(arr[j]+" ");
}
}
