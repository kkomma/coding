package codilityCode;

public class TapeEqulibrium {

	int equilibrium(int arr[], int n) 
    { 
        int sum = 0; // initialize sum of whole array 
        int leftsum = 0; // initialize leftsum 
  
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i) 
            sum += arr[i]; 
  
        for (int i = 0; i < n; ++i) { 
            sum -= arr[i]; // sum is now right sum for index i 
  
            if (leftsum == sum) 
                return i; 
  
            leftsum += arr[i]; 
        } 
  
        /* If no equilibrium index found, then return 0 */
        return -1; 
    } 

	
	public int solutionB(int[] A) {
		// write your code in Java SE 8
		int total = A.length - 1;
		int left = A[0];
		int right = 0;
		for(int i=1; i< A.length; i++){
			right += A[i];
		}
		int minDiff = Math.abs(left - right);

		for(int i=1; i < total; i++){
			left += A[i];
			right -= A[i];
			if(Math.abs(left - right) < minDiff) minDiff = Math.abs(left - right);
		}

		return minDiff;

	}

	public int solution(int[] A) {

		int min = Integer.MAX_VALUE;
		int leftSum = 0;
		int rightSum = 0;

		for (int a : A) rightSum += a;

		for (int i = 0; i < A.length - 1; i++) {
			leftSum += A[i];
			rightSum -= A[i];

			int sub = Math.abs(leftSum - rightSum);
			if (sub < min) {
				min = sub;
			}
		}

		return min;
	}

	public static void main(String... args) {

		int[] A = {-1,3,-4,5,1,-6,2,1};
		//int[] A = {0, -2147483648, -2147483648};
		//int[] A = { -7, 1, 5, 2, -4, 3, 0 }; 
		TapeEqulibrium t = new TapeEqulibrium();
		
		System.out.println(t.solution(A));
		System.out.println(t.solutionB(A));
		System.out.println(t.equilibrium(A,A.length));

		
//		// Driver code 
//				public static void main(String[] args) 
//				{ 
//					EquilibriumIndex equi = new EquilibriumIndex(); 
//					int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
//					int arr_size = arr.length; 
//					System.out.println(equi.equilibrium(arr, arr_size)); 
//				} 
				
	}
}
