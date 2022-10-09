package Basics;

import java.util.Arrays;

public class printArrayusingForEachLoop {
	 public static void main(String[] args) {
	      
		    // create an array
		    int[] numbers = {3, 9, 5, -5};
		    
		    // for each loop 
		    for (int number: numbers) {
		      System.out.println(number);
		    }
		    System.out.println(Arrays.toString(numbers));
		  }
}
