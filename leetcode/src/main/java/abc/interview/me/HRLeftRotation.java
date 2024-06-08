package abc.interview.me;
public class HRLeftRotation {
	public static int[] rotateArray(int[] arr, int d){
		// Because the constraints state d < n, we need not concern ourselves with shifting > n units.
		int n = arr.length;
		// Create new array for rotated elements:
		int[] rotated = new int[n]; 
		// Copy segments of shifted elements to rotated array:
		System.arraycopy(arr, d, rotated, 0, n - d);
		System.arraycopy(arr, 0, rotated, n - d, d);
		return rotated;
	}

	public static void main(String[] args) {
		int[] numbers = {3,2,1,4,5};
		int d = 2;
		// Rotate array by d elements:
		numbers = rotateArray(numbers, d);
		// Print array's elements as a single line of space-separated values:
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
