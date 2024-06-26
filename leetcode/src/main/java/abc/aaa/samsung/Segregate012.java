package abc.aaa.samsung;

//Java program to sort an array of 0, 1 and 2 

public class Segregate012 { 

	public static void sort012(int arr[], int n) 
	{ 
		// Variables to maintain 
		// the count of 0's,  
		// 1's and 2's in the array 
		int count0 = 0, count1 = 0; 
		for (int i = 0; i < n; i++) { 
			if (arr[i] == 0) 
				count0++; 
			if (arr[i] == 1) 
				count1++; 
			
		} 

		// Putting the 0's in the 
		// array in starting. 
		for (int i = 0; i < count0; i++)  
			arr[i] = 0; 

		// Putting the 1's in the 
		// array after the 0's. 
		for (int i = count0; i <  
				(count0 + count1); i++)  
			arr[i] = 1; 

		// Putting the 2's in the 
		// array after the 1's 
		for (int i = (count0 + count1); 
				i < n; i++)  
			arr[i] = 2; 

		printArray(arr, n); 
	} 

	// Prints the array 
	public static void printArray(int arr[], int n) 
	{ 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver function  
	public static void main(String argc[]) 
	{ 

		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 
				2, 0, 0, 0, 1 }; 
		int n = 12; 
		sort012(arr, n); 
	} 

} 

