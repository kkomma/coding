package abc.interview.me;

public class MatrixSum {

	public static void main(String[] args) {		
		int[][] a = {				
				{1,2,3,4},
				{5,6,7,8},
				{1,2,3,4},
				{1,2,3,4}
		};
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[0][3]);

		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		System.out.println("size::"+a.length);
		int sum = 0 ;
		for(int i=0; i < a.length; i++){
			for(int j=0; j < a.length; j++){
				sum = sum + a[i][j];	
			}
		}
		System.out.println("sum::"+sum);
	}
}
