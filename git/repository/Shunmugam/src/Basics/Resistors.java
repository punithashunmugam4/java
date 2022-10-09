package Basics;
import java.util.Scanner;

public class Resistors {
    public static void main(String[] args)   
    {   
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       float sum=0;
       for(int i=0;i<n;i++) {
    	   float Ri=sc.nextFloat();
    	   sum+=(1/Ri);
       }
       int ans=(int)(1/sum);
       System.out.println(ans);
    }  
}
