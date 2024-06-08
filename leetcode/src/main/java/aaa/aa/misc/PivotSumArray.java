package aaa.aa.misc;

public class PivotSumArray {

	public static void main(String[] args) {
		int[] a = {1,2,2,4,3,4,2,1,2};
		System.out.println(pivotSum(a));
	}

	private static int pivotSum(int[] a) {

		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}		
		int lsum=0;		
		for(int i=0;i<a.length;i++) {
			if(lsum==sum-a[i]-lsum) {				
				   return i;
			}
			lsum = lsum + a[i];			
		}
		return -1;
		
	}

}
