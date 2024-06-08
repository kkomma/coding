package abc.aa.amzn;

//https://www.geeksforgeeks.org/maximum-sum-in-circular-array-such-that-no-two-elements-are-adjacent/
//Java program to find maximum sum in a circular array 
//such that no elements are adjacent in the sum. 

public class MaxSumCircularArray { 

//Function to calculate the sum 
//from 0th position to(n-2)th position 
static int maxSum1(int arr[], int n) 
{ 
	int dp[]=new int[n]; 
	int maxi = 0; 

	for (int i = 0; i < n - 1; i++) { 

		// copy the element of original array to dp[] 
		dp[i] = arr[i]; 

		// find the maximum element in the array 
		if (maxi < arr[i]) 
			maxi = arr[i]; 
	} 

	// start from 2nd to n-1th pos 
	for (int i = 2; i < n - 1; i++) { 

		// traverse for all pairs 
		// bottom-up approach 
		for (int j = 0; j < i - 1; j++) { 

			// dp-condition 
			if (dp[i] < dp[j] + arr[i]) { 
				dp[i] = dp[j] + arr[i]; 

				// find maximum sum 
				if (maxi < dp[i]) 
					maxi = dp[i]; 
			} 
		} 
	} 

	// return the maximum 
	return maxi; 
} 

//Function to find the maximum sum 
//from 1st position to n-1-th position 
static int maxSum2(int arr[], int n) 
{ 
	int dp[]=new int[n]; 
	int maxi = 0; 

	for (int i = 1; i < n; i++) { 
		dp[i] = arr[i]; 

		if (maxi < arr[i]) 
			maxi = arr[i]; 
	} 

	// Traverse from third to n-th pos 
	for (int i = 3; i < n; i++) { 

		// bootom-up approach 
		for (int j = 1; j < i - 1; j++) { 

			// dp condition 
			if (dp[i] < arr[i] + dp[j]) { 
				dp[i] = arr[i] + dp[j]; 

				// find max sum 
				if (maxi < dp[i]) 
					maxi = dp[i]; 
			} 
		} 
	} 

	// return max 
	return maxi; 
} 

static int findMaxSum(int arr[], int n) 
{ 
	int t=Math.max(maxSum1(arr, n), maxSum2(arr, n)); 
	return t; 
} 

//Driver Code 
	public static void main (String[] args) { 
		
		int arr[] = { 1, 2, 3, 1 }; 
		int n = arr.length; 
		System.out.println(findMaxSum(arr, n)); 
		
	} 
} 
