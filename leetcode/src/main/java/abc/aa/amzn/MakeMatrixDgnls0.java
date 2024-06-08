package abc.aa.amzn;

//https://www.geeksforgeeks.org/program-to-convert-the-diagonal-elements-of-the-matrix-to-0/

//Java program to change value of 
//diagonal elements of a matrix to 0. 
public class MakeMatrixDgnls0 
{ 

	//to print the resultant matrix 
	static void print(int mat[][], int n, int m) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < m; j++) 
			{ 
				System.out.print(mat[i][j] + " "); 
			} 

			System.out.println(); 
		} 
	} 

	//function to change the values 
	//of diagonal elements to 0 
	static void makediagonalzero(int mat[][], 
			int n, int m) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < m; j++) 
			{ 
				// right and left diagonal condition 
				if (i == j || (i + j + 1) == n) 
				{ 
					mat[i][j] = 0; 
				} 
			} 
		} 

		// print resultant matrix 
		print(mat, n, m); 
	} 

	//Driver code 
	public static void main(String args[]) 
	{ 
		int n = 3, m = 3; 
		int mat[][] = {{2, 1, 7}, 
				{3, 7, 2}, 
				{5, 4, 9}}; 

		makediagonalzero(mat, n, m); 
	} 
} 

//This code is contributed 
//by PrinciRaj1992 

