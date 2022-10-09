package DynamicProgramming;

public class BuyAndSell {
	public static int maxProfit(int prices[]) {
		int xprofit=Integer.MIN_VALUE;
		int purchase=Integer.MAX_VALUE;
		for(int i:prices) {
			if(i<purchase)
			purchase=i;
			if(i-purchase>xprofit) xprofit=i-purchase;
		}
		return xprofit;
	}
public static void main(String []args) {
	int prices[]= {7,1,4,3,5,6};
	System.out.println(maxProfit(prices));
}
}
