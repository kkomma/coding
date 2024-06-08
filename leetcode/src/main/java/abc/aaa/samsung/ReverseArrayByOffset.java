package abc.aaa.samsung;

import java.util.Arrays;

public class ReverseArrayByOffset {

	
	public static void main(String[] args) {

		
		int[] unOrderedArr = {1, 2, 3, 4, 5, 6, 7, 8};
		int orderToRotate = 2;

		leftRotate(unOrderedArr, orderToRotate);
		System.out.println(Arrays.toString(unOrderedArr));

		/*for (int i = 0; i < orderToRotate; i++) {
		    for (int j = unOrderedArr.length - 1; j > 0; j--) {
		        int temp = unOrderedArr[j];
		    	System.out.println(temp);
		        unOrderedArr[j] = unOrderedArr[j - 1];
		        unOrderedArr[j - 1] = temp;
		    }
		}	
		System.out.println(Arrays.toString(unOrderedArr));*/
		
	}

	private static void leftRotate(int[] unOrderedArr, int orderToRotate) {

		int n = unOrderedArr.length;
		rotate(unOrderedArr , 0 , n - orderToRotate -1);
		rotate(unOrderedArr , n - orderToRotate, n-1);
		rotate(unOrderedArr , 0 , n-1);
		
	}

	private static void rotate(int[] unOrderedArr, int start, int end) {
		
		while(start< end) {
			int temp = unOrderedArr[start];
			unOrderedArr[start] = unOrderedArr[end];
			unOrderedArr[end] = temp;
			start++;
			end--;
		}
	}

}
