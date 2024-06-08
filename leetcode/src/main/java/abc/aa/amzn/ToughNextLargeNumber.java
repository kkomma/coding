package abc.aa.amzn;

//Java program to find next greater 
//number with same set of digits. 
import java.util.Arrays; 

//https://www.geeksforgeeks.org/find-next-greater-number-set-digits/

public class ToughNextLargeNumber 
{ 
	// Utility function to swap two digit 
	static void swap(char ar[], int i, int j) 
	{ 
		System.out.println("swapped");
		char temp = ar[i]; 
		ar[i] = ar[j]; 
		ar[j] = temp; 
	} 

	// Given a number as a char array number[], 
	// this function finds the next greater number. 
	// It modifies the same array to store the result 
	static void findNext(char ar[], int n) 
	{ 
		int i; 
		
		// I) Start from the right most digit 
		// and find the first digit that is smaller 
		// than the digit next to it. 
		for (i = n - 1; i > 0; i--) 
		{ 
			if (ar[i] > ar[i - 1]) { 
				break; 
			} 
		} 
		
		
		// If no such digit is found, then all 
		// digits are in descending order means 
		// there cannot be a greater number with 
		// same set of digits 
		if (i == 0) 
		{ 
			System.out.println("Not possible"); 
		} 
		else
		{ 
			int x = ar[i - 1], min = i; 
			
			// II) Find the digit on right 
			// side of (i-1)'th digit that is greater 
			// than number[i-1] 
			for (int j = i + 1; j < n; j++) 
			{ 
				if (ar[j] > x && ar[j] < ar[min]) 
				{ 
					min = j; 
				} 
			} 
			System.out.println("min::"+min);
			System.out.println("i::"+i);
			System.out.println("i-1::"+ar[i-1]);
			System.out.println("min::"+ar[min]);
			System.out.println("ar::"+new String(ar));

			// III) Swap the above found smallest 
			// digit with number[i-1] 
			swap(ar, i - 1, min);
			System.out.println(new String(ar));
			// IV) Sort the digits after (i-1) 
			// in ascending order 
			Arrays.sort(ar, i, n); 
			System.out.print("Next number with same" + 
									" set of digits is "); 
			for (i = 0; i < n; i++) 
				System.out.print(ar[i]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		char digits[] = { '5','3','4','9','7','2' ,'3'};
		String s = "edcdef";
		//char digits[] = s.toCharArray();
		int n = digits.length; 
		findNext(digits, n); 
	} 
} 

