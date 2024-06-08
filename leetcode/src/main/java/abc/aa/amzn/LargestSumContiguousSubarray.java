package abc.aa.amzn;

//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		 //int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		 int [] a = {-2, 14, 4, -1, -20, 1, 5, -3}; 

		 System.out.println(largestSumContiguousSubarray(a));
	}

	private static int largestSumContiguousSubarray(int[] a) {

		int maxSofar = Integer.MIN_VALUE;
		int maxEndingHere = 0;
		
		for(int i= 0; i < a.length; i++) {
			maxEndingHere = maxEndingHere + a[i];
			if(maxSofar < maxEndingHere ) {
				maxSofar = maxEndingHere;
			}
			if(maxEndingHere < 0) {
				maxEndingHere = 0;
			}
			//System.out.println(maxEndingHere);
		}
		return maxSofar;
	}

}
