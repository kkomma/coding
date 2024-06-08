package abc.aaa.intrbit;

import java.util.Arrays;

public class GoogleMove1 {

	public static void main(String[] args) {
		int[] a= {0,1,0,0,1,1,0};		
		int[] b= {0,1,0,0,1,2,0,2,1,2};		
		moveones(a, 1);
		movezerosonestwos(b);
	}

	private static void movezerosonestwos(int[] b) {
		int a0=0,a1=0;		
		for(int i=0; i < b.length; i++) {
			if(b[i] ==0)
				a0++;				
			if(b[i] ==1)
				a1++;						
		}
		int count = 0;
		while(count < a0) {
			b[count++] = 0;
		}
		while(count < a0+a1) {
			b[count++] = 1;
		}
		while(count < b.length) {
			b[count++] = 2;
		}		
		System.out.println(Arrays.toString(b));
	}

	private static void moveones(int[] a, int target) {
		int count = 0;
		for(int i=0; i < a.length;i++) {
			if(a[i] != target) {
				a[count++] = 0;
			}			
		}
		while(count<a.length) {
			a[count++] = 1;
		}
		System.out.println(Arrays.toString(a));
	}

}
