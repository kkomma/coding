package abc.aa.amzn;

//https://www.geeksforgeeks.org/even-numbers-even-index-odd-numbers-odd-index/

public class ArrangeEvenOdds { 

	//function to arrange 
	//odd and even numbers 
	public static void arrangeOddAndEven(int arr[], int n) 
	{ 
		int evenInd = 0; 
		int oddInd = 1; 
		
		while (true) 
		{ 
			while (evenInd < n && arr[evenInd] % 2 == 0) {
				System.out.println("even loop");
				evenInd += 2;
			}
			while (oddInd < n && arr[oddInd] % 2 == 1) {
				System.out.println("odd loop");
				oddInd += 2;
			}
			if (evenInd < n && oddInd < n) 
			{ 
				System.out.println("swapped");
				int temp = arr[evenInd]; 
				arr[evenInd] = arr[oddInd]; 
				arr[oddInd] = temp; 
			} else {
				System.out.println("break loop");
				break;
			}

		} 
	} 

	//function to print the array 
	public static void printArray(int arr[], int n) { 
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	} 

	//Driver function 
	public static void main(String argc[]){ 
		//int arr[] = { 3, 6, 12, 1, 5, 8,10,11 };
		int arr[] = { 3, 4, 11, 2, 13};
		int n = arr.length;
		System.out.print("Original Array: "); 
		printArray(arr, n); 
		arrangeOddAndEven(arr, n);
		System.out.print("\nModified Array: "); 
		printArray(arr, n); 
	} 
} 
