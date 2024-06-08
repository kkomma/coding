package abc.aa.amzn;

//https://www.geeksforgeeks.org/divide-array-two-sub-arrays-averages-equal/

public class DevideArrayByAvg {

	static void findSubarrays(int arr[], int n) 
	{ 
	    // Find array sum 
	    int sum = 0; 
	    for (int i = 0; i < n; i++) 
	        sum += arr[i]; 
	  
	    boolean found = false; 
	    int lsum = 0; 
	    for (int i = 0; i < n - 1; i++) 
	    { 
	        lsum += arr[i]; 
	        int rsum = sum - lsum; 
	  
	        // If averages of arr[0...i]  
	        // and arr[i+1..n-1] are same.  
	        // To avoid floating point problems 
	        // we compare "lsum*(n-i+1)"  
	        // and "rsum*(i+1)" instead of  
	        // "lsum/(i+1)" and "rsum/(n-i+1)" 
	        if (lsum * (n - i - 1) == rsum * (i + 1)) 
	        { 
	        	System.out.println(String.format("From (%d %d) to (%d %d)", 0, i, i+1, n-1)); 
	            found = true; 
	        } 
	    }
	    // If no subarrays found 
	    if (found == false) 
	       System.out.println("not found");
	} 
	
	
	public static void main(String[] args) {

		int arr[] = {1, 5, 7, 2, 0}; 
	    int n = arr.length; 
	    findSubarrays(arr, n); 
	}

}
