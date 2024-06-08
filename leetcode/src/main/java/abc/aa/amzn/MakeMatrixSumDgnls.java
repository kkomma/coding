package abc.aa.amzn;

public class MakeMatrixSumDgnls {

	//Function to return the sum of both the 
	//diagonal elements of the required matrix 
	static int findSum(int n) 
	{ 
		// Array to store sum of diagonal elements 
		int[] dp = new int[n + 1]; 
		// Base cases 
		dp[1] = 1; 
		dp[0] = 0; 

		// Computing the value of dp 
		for (int i = 2; i <= n; i++) 
		{ 
			dp[i] = (4 * (i * i)) - (6 * (i - 1)) + dp[i - 2]; 
			System.out.println(dp[i]);
		} 

		return dp[n]; 
	} 

	//Driver code 
	public static void main(String args[]) 
	{ 
		int n = 3;
		System.out.println(findSum(n)); 
	} 
} 

//This code is contributed by Akanksha Rai 
