package Basics;
import java.io.*;
public class NumberGame {
	    // Function that returns count of non- decreasing numbers
	    // with n digits
	    static long nonDecNums(int n)
	    {
	        // a[i][j] = count of all possible number
	        // with i digits having leading digit as j
	        long[][] a = new long[n + 1][10];
	 
	        // Initialization of all 0-digit number
	        for (int i = 0; i <= 9; i++)
	            a[0][i] = 1;
	 
	        // Initialization of all i-digit
	        // non-decreasing number leading with 9
	        for (int i = 1; i <= n; i++)
	            a[i][9] = 1;
	 
	        // for all digits we should calculate
	        // number of ways depending upon leading
	        // digits
	        for (int i = 1; i <= n; i++)
	            for (int j = 8; j >= 0; j--)
	                a[i][j] = a[i - 1][j] + a[i][j + 1];
	 
	        return a[n][1];
	    }
	 
	    // driver program
	    public static void main(String[] args)
	    {
	        long n = 10;
	        int m=(int)n;
	        System.out.println("Non-decreasing digits = " + nonDecNums(m));
	    }
	}

//class NumberGame {
//	 
//    // Returns factorial of n
//    static long fact(int n)
//    {
//        long res = 1;
//        for (int i = 2; i <= n; i++)
//            res = res * i;
//        return res;
//    }
// 
//    // returns nCr
//    static long nCr(int n, int r)
//    {
//        return fact(n) / (fact(r) * fact(n - r));
//    }
// 
//    // Driver code
//    public static void main(String[] args)
//    {
//        int n = 3;
//        System.out.println(
//            "Number of Non-Decreasing digits: "
//            + nCr(n + 9, 9));
//    }
//}
// 