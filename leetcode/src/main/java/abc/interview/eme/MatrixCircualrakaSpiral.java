package abc.interview.eme;


/**
 * The class Circular_Matrix creates a Square Matrix of size n*n and fills it in a circular fashion
 * @author : www.javaforschool.com
 * @Program Type : BlueJ Program - Java
 */

class MatrixCircualrakaSpiral
{
	public static void main(String args[])
	{

		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		String s = sc.nextLine();*/

		int n =4;		
		int A[][] = new int[n][n];
		int k=1, c1=0, c2=n-1, r1=0, r2=n-1;

		//http://www.guideforschool.com/1260759-java-program-to-print-circular-spiral-matrix/

		while(k<=n*n)
		{
			//Step 1: We will fill the elements of Row 0 (R1), starting from Column 0 (C1) till ‘n-1’ (C2). The cells which will be filled are marked in the image above in yellow color.

			for(int i=c1;i<=c2;i++)
			{
				A[r1][i]=k++;
			}
			//Step 2: Now, we will fill the elements of Column ‘n-1’ (C2), starting from Row R1+1 till R2. The cells which will be filled are marked in the image above in grey color.
			for(int j=r1+1;j<=r2;j++)
			{
				A[j][c2]=k++;
			}
			//Step 3: Next we will fill the elements of Row ‘n-1’ (R2), starting from Column C2-1 till C1. The cells which will be filled are marked in the image above in green color.
			for(int i=c2-1;i>=c1;i--)
			{
				A[r2][i]=k++;

			}
			//Step 4: Now, we will fill the elements of Column C1, starting from Row R2-1 till R1+1. The cells which will be filled are marked in the image above in blue color.
			for(int j=r2-1;j>=r1+1;j--)
			{
				A[j][c1]=k++;

			}

			c1++;
			c2--;
			r1++;
			r2--;
		}


		int l=1; 
		c1=0; 
		c2=n-1; 
		r1=0; 
		r2=n-1;

		while(l<=n*n)
		{
			//Step 1: We will fill the elements of Row 0 (R1), starting from Column 0 (C1) till ‘n-1’ (C2). The cells which will be filled are marked in the image above in yellow color.

			for(int i=c1;i<=c2;i++)
			{

				System.out.println(A[r1][i]);
				l++;
			}
			//Step 2: Now, we will fill the elements of Column ‘n-1’ (C2), starting from Row R1+1 till R2. The cells which will be filled are marked in the image above in grey color.
			for(int j=r1+1;j<=r2;j++)
			{

				System.out.println(A[j][c2]);
				l++;
			}
			//Step 3: Next we will fill the elements of Row ‘n-1’ (R2), starting from Column C2-1 till C1. The cells which will be filled are marked in the image above in green color.
			for(int i=c2-1;i>=c1;i--)
			{

				System.out.println(A[r2][i]);
				l++;
			}
			//Step 4: Now, we will fill the elements of Column C1, starting from Row R2-1 till R1+1. The cells which will be filled are marked in the image above in blue color.
			for(int j=r2-1;j>=r1+1;j--)
			{

				System.out.println(A[j][c1]);
				l++;
			}

			c1++;
			c2--;
			r1++;
			r2--;
		}


		/* Printing the Circular matrix */
		System.out.println("The Circular Matrix is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(A[i][j]+ "\t");
			}
			System.out.println();
		}
		
		int[][] arr2 = new int[n][n];		
		arr2 = A.clone();
		
		/* Printing the Circular matrix */
		System.out.println("The Circular Matrix is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(A[i][j]+ "\t");
			}
			System.out.println();
		}
		
		/* Printing the Circular matrix */
		System.out.println("The Circular Matrix is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((A[i][j]+arr2[i][j])+ "\t");
			}
			System.out.println();
		}
		
		
	}
}
