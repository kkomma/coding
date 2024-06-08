package abc.aaa.samsung;

import java.util.Arrays;

public class MinMaxSum {
	static int[] a = {4,3,2,1,5};
	
	public static void main(String[] args) {
		int sum = 0;
//		for(int i=0; i < a.length; i++) {
//			for(int j=0; j < a.length; j++) {
//				if(a[i] < a[j]) {
//					swap(i,j);
//				}
//			}
//		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		for(int i=0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("max sum value:" + (sum - a[0]));
		System.out.println("min sum value:" + (sum - a[a.length-1]));
	}
	
	private static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

