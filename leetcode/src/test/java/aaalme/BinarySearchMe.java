package aaalme;

import org.assertj.core.util.Arrays;

public class BinarySearchMe {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			int idx = findElement(a,i+1);		
			System.out.println("idx::"+idx);	
		}
		int[] b = {1,33,22,2,44};
		bubbleSort(b);
		System.out.println(Arrays.asList(b));
		
	}

	private static int findElement(int[] a,int target) {
		int l  = 0;
		int r = a.length-1;
		while(l<=r) {			
			int mid = l + (r-l)/2;
			if(a[mid] == target) {
				return mid;
			}else if(a[mid] < target) {
				l = mid+1;
			}else {
				r  =mid-1;
			}									
		}
		return -1;		
	}
	
	
	private static void bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;							
				}
				
			}						
		}
		
	}

}
