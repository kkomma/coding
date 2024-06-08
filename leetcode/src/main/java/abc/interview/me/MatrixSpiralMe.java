package abc.interview.me;

public class MatrixSpiralMe {

	void matrixSprial(int n){
		int[][] a = new int[n][n];
		int k = 1;
		int c1 =0, c2 = n-1, r1=0, r2 = n-1;

		while(k<=n*n){			

			for(int i = 0; i <=r2; i++ ){
				a[r1][i] = k++;
				System.out.println(r1+","+i+"::is::"+k);
			}
			for(int i = r1+1; i <=r2; i++ ){
				a[i][c2] = k++;
				System.out.println(i+","+c2+"::is::"+k);
			}
			
			for(int i = c2-1; i >=c1; i-- ){
				a[r2][i] = k++;
				System.out.println(r2+","+(i)+"::is::"+k);
			}
			for(int i = r2-1; i >r1+1; i-- ){
				a[i][c1] = k++;
				System.out.println(i+","+c1+"::is::"+k);
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
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MatrixSpiralMe nn = new MatrixSpiralMe();
		nn.matrixSprial(6);	
	}

}
