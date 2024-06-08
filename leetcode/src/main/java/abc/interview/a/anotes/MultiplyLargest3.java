package abc.interview.a.anotes;

public class MultiplyLargest3 {

	public static void main(String[] args) {
		int[] a = {3,1,5,4,8,2,9,11};
		multiplylargest3(a, 3);
	}

	private static void multiplylargest3(int[] a, int largestt) {
		int timeComplexity = 0;
		int product = 1;		

		for(int j=0; j< largestt;j++) {
			int max = a[0];
			int pos = 0;
			for(int i=1; i < a.length;i++) {
				timeComplexity++;
				if(max < a[i]) {
					pos = i;
				}				
			}
			product = a[pos]*product;
			a[pos] = Integer.MIN_VALUE;
		}			
		System.out.println("product:"+product);
		System.out.println("time complexity:"+timeComplexity);
	}

}
