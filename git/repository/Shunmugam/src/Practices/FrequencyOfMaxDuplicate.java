package Practices;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfMaxDuplicate {
	static int maxFreq(int []arr, int n)
	{
	   
	    int max=-1,maxcount=0;
	    for(int i=0;i<n-1;i++) {
	    	int count=1;
	    	for(int j=0;j<n;j++) {
	    		if(arr[i]==arr[j]) 
	    			count++;
	    	}
	    	if(count>maxcount) {
    			maxcount=count;
    			max=arr[i];
    		}
    		if(count==maxcount) {
    			max=Math.max(max, arr[i]);
    		}
	    }
	    return max;
	}
	static void maxFreq1(int []arr, int n) {
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hash.containsKey(arr[i])) 
				hash.put(arr[i], hash.get(arr[i])+1);
			else
				hash.put(arr[i], 1);
		}
		int count=0,array=0;
		for(Map.Entry<Integer, Integer> e:hash.entrySet()) {
			if(e.getValue()>count) {
				array=e.getKey();
				count=e.getValue();
			}
		}
		System.out.println("Element " +array +" occurs "  +count +" times");
	}
	 
	  // Driver code
	public static void main (String[] args) {
	    int arr[] = {40,50,30,40,30,30,50};
	    int n = arr.length;
	    int freq =  maxFreq(arr , n);
	    int count = 0;
	    for(int i = 0; i < n; i++) {
	        if(arr[i] == freq) {
	            count++;
	        }
	    }
	    System.out.println("Element " +maxFreq(arr , n) +" occurs "  +count +" times" );
	    maxFreq1(arr , n);
	}
}
