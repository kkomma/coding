package abc.aaa.intrbit;

import java.util.Arrays;

public class NextLargeNumberMe {

	public static void main(String[] args) {
        int[] a = {3,1,5,1,8,7};
		nextNr(a);
	}

	private static void nextNr(int[] a) {

		int i;
		for(i = a.length - 1; i > 0; i--) {			
			if(a[i] > a[i-1]) {
				break;
			}
		}		
		System.out.println(i);
		System.out.println(a[i]);
		int min = i;
		int x = a[i-1];
		for(int j = i+1; j < a.length; j++) {			
			if(a[j] > x && a[j] < a[min]) {
				min = j;
			}
		}	
		swap(a, i-1, min);
		Arrays.sort(a , i, a.length);		
		System.out.println(Arrays.toString(a));
	}

	private static void swap(int[] a, int i, int i2) {
		int temp = a[i];
		a[i] = a[i2];
		a[i2] = temp;
	}

}
