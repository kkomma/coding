package abc.aaa.samsung;

import java.util.Arrays;

public class RotateArrayInteger {

	private static int[] leftRotate(int[] A , int K) {

		int len = A.length;
		if(len>0) {
			K = K % len;				
		}	     
		reverse(A, 0, len - K - 1);
		reverse(A, len - K, len - 1);
		reverse(A, 0, len - 1);
		return A;
	}

	private static void reverse(int[] str, int start, int end) {
		while (start < end) {
			int temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	public static void rightRotate(int[] A, int K) {
		leftRotate(A,A.length - K);
	}
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};		
		leftRotate(A,3);
		System.out.println(Arrays.toString(A));

		int[] B = {1,2,3,4,5};		
		rightRotate(B,3);
		System.out.println(Arrays.toString(B));
		
	}

}
