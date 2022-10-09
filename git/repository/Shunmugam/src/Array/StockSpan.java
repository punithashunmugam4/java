package Array;
import java.util.*;
import java.io.*;
import java.lang.*;
public class StockSpan {
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        
	        while(t-- > 0)
	        {
	            int n =sc.nextInt();
	            int a[] = new int[n];
	            
	            int i = 0;
	            for(i = 0; i < n; i++)
	              a[i] = sc.nextInt();
	              
	            int[] s = new Solution().calculateSpan(a, n);
	            
	            for(i = 0; i < n; i++)
	            {
	                System.out.print(s[i] + " ");
	            }
	            
	            System.out.println();
	        }
	    }   
	}
	class Solution
	{
	    public static int[] calculateSpan(int price[], int n)
	    {
	 int ans[]=new int[n];
	 Stack<Integer> st=new Stack<>();
	 for(int i=0;i<n;i++){
	     if(st.isEmpty())
	     ans[i]=i+1;
	     else if(price[st.peek()]>price[i])
	     ans[i]=i-st.peek();
	     else if(price[st.peek()]<=price[i]){
	         while(!st.isEmpty() && price[st.peek()]<=price[i])
	         st.pop();
	         if (st.isEmpty()) ans[i] = i + 1;
	                else ans[i] = i - st.peek();
	     }
	     st.push(i);
	     
	 }
	 return ans;
	}
	}
