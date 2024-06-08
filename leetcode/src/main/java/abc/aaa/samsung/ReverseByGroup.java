package abc.aaa.samsung;

import java.util.Arrays;

public class ReverseByGroup {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		reverseByGroup(a,a.length,3);
		System.out.println(Arrays.toString(a));
	}

	private static void reverseByGroup(int[] a, int n, int k) {
		
		for(int i=0;i<n;i=i+k) {
			int left = i;
			int right = Math.min(i+k-1, n-1);
			
			int temp;
			while(left<right) {
				temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}
		
	}

}
