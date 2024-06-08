package abc.interview.a.anotes;

public class BitCoinPrice {

	public static int getMaxProfit(int[] A) {
		  if (A.length < 2) {
		    return 0;
		  }
		  int minPrice = A[0];
		  int maxProfit = A[1] - A[0];
		  for (int i = 1; i < A.length; i++) {
		    int currentPrice = A[i];
		    int potentialProfit = currentPrice - minPrice;
		    maxProfit = Math.max(maxProfit, potentialProfit);
		    minPrice = Math.min(minPrice, currentPrice);
		  }		 
		  return maxProfit;
		}
	
	
	public static void main(String[] args) {
		int[] a = {11, 8, 6, 7, 12, 9};		
		System.out.println(getMaxProfit(a));
		int[] b = {5, 4, 3, 2, 1};
		System.out.println(getMaxProfit(b));
		System.out.println(getMaxProfit(new int[] {}));
	}

}
