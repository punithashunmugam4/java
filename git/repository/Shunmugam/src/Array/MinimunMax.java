package Array;

public class MinimunMax {
public static class Pair {
	int min;
	int max;
}
static Pair getMinMax(int arr[],int n){
	Pair minmax=new Pair();
	int i;
	if(n==1) {
		minmax.min=arr[0];
		minmax.max=arr[0];
		return minmax;
	}
	if(arr[0]>arr[1]) {
		minmax.min=arr[1];
		minmax.max=arr[0];
	}
	else {
		minmax.min=arr[0];
		minmax.max=arr[1];
	}
	for(i=2;i<n;i++) {
		if(arr[i]<minmax.min) {
			minmax.min=arr[i];
		}
		else if(arr[i]>minmax.max) {
			minmax.max=arr[i];
		}
	}
	return minmax;
}
public static void main(String[] args) {
	int arr[]= {5,89,6,9,6,9,4,65};
	int n=arr.length;
	Pair minmax=getMinMax(arr,n);
	System.out.println(minmax.min+ " "+ minmax.max);
}
}
