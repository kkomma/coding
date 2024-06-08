package abc.aaa.samsung;

//Java program to implement front and back search 
public class FrontandBackSearch { 

	static boolean search(int arr[], int n, int x) 
	{ 
		// Start searching from both ends 
		int front = 0, back = n - 1;
		// Keep searching while two indexes 
		// do not cross. 
		while (front <= back) 
		{ 
			if (arr[front] == x || arr[back] == x) 
				return true; 
			front++; 
			back--; 
		} 

		return false; 
	} 

	// driver code 
	public static void main (String[] args) 
	{ 
		int arr[] = {10, 20, 80, 30, 60, 50, 
				110, 100, 130, 170}; 
		int x = 130; 
		int n = arr.length; 

		if (search(arr, n, x)) 
			System.out.print("Yes"); 
		else
			System.out.print("No"); 
	} 
} 

//This code is contributed by Anant Agarwal. 

