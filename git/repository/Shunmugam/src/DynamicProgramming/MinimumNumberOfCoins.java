package DynamicProgramming;

public class MinimumNumberOfCoins {
	public static int minCoinsBottomUp(int coins[],int n,int t) {
		if(t==0) return 0;
		int dp[]=new int[t+1];
		dp[0]=0;
		for(int i=1;i<=t;i++) {
			dp[i]=Integer.MAX_VALUE;
		}
		for(int i=1;i<=t;i++) {
			for(int j=0;j<n;j++) {
				if(coins[j]<=i) {
				int sub_res=dp[i-coins[j]];
				if(sub_res!=Integer.MAX_VALUE && sub_res+1<dp[i])
					dp[i]=sub_res+1;
				}
			}
		}
		if(dp[t]==Integer.MAX_VALUE) return -1;
		return dp[t];
	}
	// T.C: O(nt)
	// S.C: O(t)
	public static int minCoinsRecur(int coins[], int m, int V)
	    {
	       // base case
	       if (V == 0) return 0;
	      
	       // Initialize result
	       int res = Integer.MAX_VALUE;
	      
	       // Try every coin that has smaller value than V
	       for (int i=0; i<m; i++)
	       {
	         if (coins[i] <= V)
	         {
	             int sub_res = minCoinsRecur(coins, m, V-coins[i]);
	      
	             // Check for INT_MAX to avoid overflow and see if
	             // result can minimized
	             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
	                res = sub_res + 1;
	         }
	       }
	       return res;
	    }
	// T.C: ecponential
	// S.C: more than O(n)
public static void main(String []args) {
	 int coins[] = {9, 6, 5, 1};
     int n = coins.length;
     int target = 11;
     System.out.println ( "Minimum coins required is "
                         + minCoinsBottomUp(coins, n, target));
     System.out.println ( "Minimum coins required is "
             + minCoinsRecur(coins, n, target));
}
}
