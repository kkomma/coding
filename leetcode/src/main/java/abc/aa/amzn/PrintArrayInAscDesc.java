package abc.aa.amzn;

//Java program to print first half in 
//ascending order and the second half 
//in descending order 
import java.util.*; 

//https://www.geeksforgeeks.org/sort-first-half-in-ascending-and-second-half-in-descending-order/

public class PrintArrayInAscDesc 
{ 
//function to print half of the array in 
//ascending order and the other half in 
//descending order 
static void printOrder(int[] arr, int n) 
{ 
	// sorting the array 
	Arrays.sort(arr); 

	// printing first half in ascending 
	// order 
	for (int i = 0; i < n / 2; i++) 
		System.out.print(arr[i]+" "); 

	System.out.println();
	// printing second half in descending 
	// order 
	for (int j = n - 1; j >= n / 2; j--) 
	System.out.print(arr[j]+" "); 
	
} 

//Driver code 
public static void main(String[] args) 
{ 
	int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 }; 
	int n = arr.length; 
	printOrder(arr, n); 

} 
} 
/* This code is contributed by Mr. Somesh Awasthi */

