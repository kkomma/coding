package abc.aa.amzn;

//https://www.geeksforgeeks.org/find-the-element-whose-multiplication-with-1-makes-array-sum-0/

//Java program to find minimum index 
//such that sum becomes 0 when the 
//element is multiplied by -1 

public class MinIndexToNullifySum { 
	
//Function to find minimum index 
//such that sum becomes 0 when the 
//element is multiplied by -1 
static int minIndex(int arr[], int n) 
{ 
	// Find array sum 
	int sum = 0; 
	for (int i = 0; i < n; i++) 
		sum += arr[i]; 

	// Find element with value equal to sum/2 
	for (int i = 0; i < n; i++) { 
		// when sum is equal to 2*element 
		// then this is our required element 
		if (2 * arr[i] == sum) 
			return (i + 1); 
	} 

	return -1; 
} 

//Driver code 


	public static void main (String[] args) { 
			int []arr = { 1, 3, -5, 3, 4 }; 
	int n =arr.length; 
	System.out.print( minIndex(arr, n)); 
	} 
} 

//This code is contributed by anuj_67.. 

