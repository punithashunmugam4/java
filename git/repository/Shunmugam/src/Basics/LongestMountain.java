package Basics;

public class LongestMountain {
public static void main(String args[]) {
	int nums[]= {2,0,2,1,1,0};
	//0->red;1->white;2->blue
	int n=nums.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(nums[j+1]<nums[j]) {
			int temp=nums[j];
			nums[j]=nums[j+1];
			nums[j+1]=temp;
			}
		}
	}
	for(int i=0;i<n;i++){
		System.out.print(nums[i]+" ");
	}
}
}
