package Basics;

import java.util.Arrays;
import java.util.Iterator;

public class printArrayusingIterator {
	 public static void main(String args[]){
	      int[] myArray = {897, 56, 78, 90, 12, 123, 75};
	      Iterator<Integer> itr=Arrays.stream(myArray).iterator();
	      while(itr.hasNext()){
	    	  System.out.print(itr.next()+" ");
	      }
	 }
}
