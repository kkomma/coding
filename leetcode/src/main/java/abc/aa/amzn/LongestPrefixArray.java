package abc.aa.amzn;

public class LongestPrefixArray {
	// Function to find the max index  
	// of largest prefix with same 
	// number if X and Y 
	static int findIndex(int []arr, int X, 
			int Y, int n) 
	{ 

		// counters for X and Y 
		int nx = 0, ny = 0; 

		int result = -1; 
		for (int i = 0; i < n; i++) 
		{ 
			// If value is equal to X  
			// increment counter of X 
			if (arr[i] == X) 
				nx++; 

			// If value is equal to X 
			// increment counter of X 
			if (arr[i] == Y) 
				ny++; 

			// If counters are equal(but not 
			// zero) save the result as i 
			if ((nx == ny) && (nx != 0 && ny != 0)) 
				result = i; 
		} 

		return result; 
	} 

	// Driver code 
	static public void main (String[] args) 
	{ 
		int []arr = {7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7}; 
		int X = 7, Y = 42; 
		int n = arr.length; 
		System.out.println("Ending index of prefix is "
				+ findIndex(arr, X, Y, n)); 
	} 

}
